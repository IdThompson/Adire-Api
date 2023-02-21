package com.decagon.adire.controller;

import com.decagon.adire.dto.request.DesignerDTO;
import com.decagon.adire.dto.request.LoginDTO;
import com.decagon.adire.dto.response.AppResponse;
import com.decagon.adire.dto.response.TokenResponse;
import com.decagon.adire.exception.CustomException;
import com.decagon.adire.utils.SecurityUtil;
import com.decagon.adire.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static com.decagon.adire.utils.SecurityConstants.PASSWORD_NOT_MATCH_MSG;
import static com.decagon.adire.utils.SecurityUtil.doesBothStringMatch;


@Slf4j
@Tag(name = "Authentication Controller")
@RestController
@AllArgsConstructor
@RequestMapping("/adire/auth")
public class AuthController {

    private final UserService userService;

    private final AuthenticationManager authenticationManager;

    @PostMapping(path = "/register")
    @Operation(summary = "Register New User", responses = {
            @ApiResponse(responseCode = "201",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = DesignerDTO.class)))})
    public ResponseEntity<AppResponse<?>> registerUser(@RequestBody @Valid final DesignerDTO designerDTO) {
        log.info("controller register: register user :: [{}] ::", designerDTO.getEmail());
        validateDesginer(designerDTO);
        DesignerDTO response = userService.registerUser(designerDTO);
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/v1/auth/register").toUriString());
        return ResponseEntity.created(uri).body(AppResponse.buildSuccess(response));
    }

    private void validateDesginer(DesignerDTO request) {
        log.info("validating user registration request for email :: {}", request.getEmail());
        if (!doesBothStringMatch(request.getConfirmPassword(), request.getPassword())) {
            throw new CustomException(PASSWORD_NOT_MATCH_MSG, HttpStatus.BAD_REQUEST);
        }
//        List<String> roleEnum = List.of("DESIGNER", "CUSTOMER");
//
//        String role = request.getRole();
//        if (role != null) {
//            role = role.trim().toUpperCase();
//            if (!roleEnum.contains(role)) {
//                throw new CustomException("Invalid role, Options includes: USER, ADMIN, STAFF, VENDOR ");
//            }
//        }
        log.info("successful validation for user registration request for email :: {}", request.getEmail());
    }


    @PostMapping("/login")
    @Operation(summary = "Login User", responses = {
            @ApiResponse(responseCode = "200",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = TokenResponse.class)))})
    public ResponseEntity<?> authenticateAndGetToken(@RequestBody LoginDTO request) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));

        if (authentication.isAuthenticated()) {
            TokenResponse response = SecurityUtil.generateToken(authentication);
            return ResponseEntity.status(200).body(AppResponse.builder().result(response).message("Authenticated").build());
        } else {
            throw new UsernameNotFoundException("invalid user request !");
        }
    }
}
