package com.example.SistemabancarioDitial.dto;

import com.example.SistemabancarioDitial.model.Client;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AccountDTO{
    private long id_account;
    private long numbercount;
    private String agency;
    private double saldo_atual;
    private String criacao_conta;
    private Client client;
}
