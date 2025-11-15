package com.example.SistemabancarioDitial.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



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
    @OneToMany
    private Long id_client;

    @Column(name = "name", nullable = false)
    @OneToMany
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

    @Column(name = "Data de Nascimento", nullable = false)
    @NotBlank(message = "A data de nascimento não pode estar em branco")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String datanascimento;

    @Column(name = "endereço", nullable = false)
    @NotBlank(message = "O endereço não pode estar em branco")
    @Size(max = 100, message = "O endereço deve ter no máximo 100 caracteres")
    private String endereco;

    @Column(name = "Telefone", nullable = false)
    @NotBlank(message = "O telefone não pode estar em branco")
    @Size(max = 11, message = "O telefone deve ter no máximo 11 caracteres")
    private String telefone;



}