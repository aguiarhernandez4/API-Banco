package com.example.SistemabancarioDitial.dto;

import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoginRequest {
    @Email
    private String email;

    private String username;

    private String password;
}
