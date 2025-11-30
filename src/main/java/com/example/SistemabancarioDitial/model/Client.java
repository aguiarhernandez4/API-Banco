package com.example.SistemabancarioDitial.model;

import jakarta.validation.constraints.Email;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;


import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Table(name = "Client")
@Getter
@Entity
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client", nullable = false)
    private Long id_client;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf", nullable = false, unique = true)
    @Size(max = 11)
    @NotBlank(message = "O CPF não pode estar em branco")
    private String cpf;

    @Column(name = "email", nullable = false, unique = true)
    @NotBlank(message = "O e-mail não pode estar em branco")
    private String email;

    @Column(name = "password", nullable = false)
    @NotBlank(message = "A senha não pode estar em branco")
    @Size(min = 6, max = 12, message = "A senha deve ter entre 6 e 12 caracteres")
    private String password;

    @Column(name = "data_nascimento", nullable = false)
    private String datanascimento;

    @Column(name = "endereco", nullable = false)
    @NotBlank(message = "O endereço não pode estar em branco")
    @Size(max = 100, message = "O endereço deve ter no máximo 100 caracteres")
    private String endereco;

    @Column(name = "telefone", nullable = false)
    @NotBlank(message = "O telefone não pode estar em branco")
    @Size(max = 11, message = "O telefone deve ter no máximo 11 caracteres")
    private String telefone;


}