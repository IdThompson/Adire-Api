package com.decagon.adire.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
@Setter
@Getter

public class BaseResponse <T>{
    private T data;
    private String message;
    private LocalDateTime timestamp = LocalDateTime.now();

    public BaseResponse(T data, String message) {
        this.data = data;
        this.message = message;
        this.timestamp = timestamp;
    }
}
