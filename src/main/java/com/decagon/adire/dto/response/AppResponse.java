package com.decagon.adire.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AppResponse<T> {

    private String message;
    private HttpStatus status;
    private Boolean isSuccessful;
    private final LocalDateTime time = LocalDateTime.now();
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T result;

    public static  <T> AppResponse<T> buildSuccessTxn(T data) {
        AppResponse<T> response = new AppResponse<>();
        response.setIsSuccessful(true);
        response.setStatus(HttpStatus.OK);
        response.setMessage("Success");
        response.setResult(data);
        return response;
    }

    public static  <T> AppResponse<T> buildSuccess(T data) {
        AppResponse<T> response = new AppResponse<>();
        response.setIsSuccessful(true);
        response.setMessage("Success");
        response.setResult(data);
        return response;
    }

    public static AppResponse<Void> build() {
        AppResponse<Void> response = new AppResponse<>();
        response.setIsSuccessful(true);
        response.setMessage("Success");
        return response;
    }

}