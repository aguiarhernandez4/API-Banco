package com.example.SistemabancarioDitial.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoginResponse {
    private String username;
    private String token;
    private String type;
    private String message;
}
