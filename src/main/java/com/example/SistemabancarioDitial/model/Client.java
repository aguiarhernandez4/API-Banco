package com.example.SistemabancarioDitial.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Table(name = "Client")
@Getter
@Schema(description = "Entidade que representa um cliente")
@Entity
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client", nullable = false)
    private Long id_client;

    @Column(name = "name", nullable = false)
    @Schema(description = "Nome do cliente", example = "João Silva")
    private String name;

    @Column(name = "cpf", nullable = false, unique = true)
    @Size(max = 11)
    @NotBlank(message = "O CPF não pode estar em branco")
    @Schema(description = "CPF do cliente", example = "12345678901")
    private String cpf;

    @Email
    @Column(name = "email", nullable = false, unique = true)
    @NotBlank(message = "O e-mail não pode estar em branco")
    @Schema(description = "E-mail do cliente", example = "email@gmail.com")
    private String email;

    @Column(name = "password", nullable = false)
    @NotBlank(message = "A senha não pode estar em branco")
    @Size(min = 6, max = 12, message = "A senha deve ter entre 6 e 12 caracteres")
    @Schema(description = "Senha do cliente", example = "senha123")
    private String password;

    @Column(name = "data_nascimento", nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Schema(description = "Data de nascimento do cliente", example = "31/12/1990")
    private String datanascimento;

    @Column(name = "endereco", nullable = false)
    @NotBlank(message = "O endereço não pode estar em branco")
    @Size(max = 100, message = "O endereço deve ter no máximo 100 caracteres")
    @Schema(description = "Endereço do cliente", example = "Rua das Flores, 123, São Paulo, SP")
    private String endereco;

    @Column(name = "telefone", nullable = false)
    @NotBlank(message = "O telefone não pode estar em branco")
    @Size(max = 11, message = "O telefone deve ter no máximo 11 caracteres")
    @Schema(description = "Telefone do cliente", example = "11987654321")
    private String telefone;


}