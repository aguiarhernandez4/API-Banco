package com.example.SistemabancarioDitial.service;

import com.example.SistemabancarioDitial.dto.LoginRequest;
import com.example.SistemabancarioDitial.dto.LoginResponse;
import com.example.SistemabancarioDitial.model.User;
import com.example.SistemabancarioDitial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepo;

    public LoginResponse login(LoginRequest request){

        User user = userRepo.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        
        if (!user.getPassword().equals(request.getPassword())){
            throw new RuntimeException("Senha incorreta");
        }

        String fakeToken = "Token" + user.getPassword() + System.currentTimeMillis();

        return LoginResponse.builder()  
            .username(user.getUsername())
            .message("Login realizado com sucesso")
            .token(fakeToken)
            .build();
    }
}
