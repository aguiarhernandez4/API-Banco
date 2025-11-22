package com.example.SistemabancarioDitial.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClientDTO {
    private Long id_client;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private String datanascimento;
    private String endereco;
    private String telefone;
}
