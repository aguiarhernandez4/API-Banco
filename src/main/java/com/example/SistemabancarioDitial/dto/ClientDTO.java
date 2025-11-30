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
    private ClientDTO id;
    private String name;
    private String cpf;
    private String email;
    private String datanascimento;
    private String endereco;
    private String telefone;
    private String password;
}
