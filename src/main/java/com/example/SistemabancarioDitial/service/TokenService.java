package com.example.SistemabancarioDitial.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.SistemabancarioDitial.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.security.AlgorithmParameters;
import java.util.Date;

@Service
public class TokenService {
    private final String SECRET =  "MEUSEGREDOSEGURO123";

    public String generateToken(User user) {
        return Jwts.builder()
                .setSubject(user.getUsername())
                .claim("role", user.getRole())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 2_592_000_000L))
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
    }

    public String getUsenameFromToken(String token) {
        Algorithm algorithm = Algorithm.HMAC256(SECRET);

        return JWT.require(algorithm)
                .withIssuer("meusistema")
                .build()
                .verify(token)
                .getSubject();
    }
}
