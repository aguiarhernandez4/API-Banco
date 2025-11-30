package com.example.SistemabancarioDitial.service;

import com.example.SistemabancarioDitial.dto.LoginRequest;
import com.example.SistemabancarioDitial.dto.LoginResponse;
import com.example.SistemabancarioDitial.model.User;
import com.example.SistemabancarioDitial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private TokenService tokenService;

    public LoginResponse login(LoginRequest request){

        User user = userRepo.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())){
            throw new RuntimeException("Senha incorreta!");
        }

        String jwt = tokenService.generateToken(user);

        return LoginResponse.builder()  
            .username(user.getUsername())
            .message("Login realizado com sucesso")
            .token(jwt)
            .build();
    }
}
