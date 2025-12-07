package com.example.SistemabancarioDitial.dto;

import com.example.SistemabancarioDitial.model.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountDTO{
    private long id_account;
    private long numbercount;
    private String agency;
    private double saldo_atual;
    private String datacriacao_conta;
}
