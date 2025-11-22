package com.example.SistemabancarioDitial.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "email")
    private Client email;

    @ManyToOne
    @JoinColumn(name = "senha")
    private Client senha;

    @ManyToOne
    @JoinColumn(name = "cpf")
    private Client cpf;

    private boolean active = true;

}
