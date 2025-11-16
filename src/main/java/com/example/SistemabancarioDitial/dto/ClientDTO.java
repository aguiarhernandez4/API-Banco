package com.example.SistemabancarioDitial.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientDTO {
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private String datanascimento;
    private String endereco;
    private String telefone;
}
