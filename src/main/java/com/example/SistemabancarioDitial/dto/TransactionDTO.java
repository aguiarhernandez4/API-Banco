package com.example.SistemabancarioDitial.dto;

import com.example.SistemabancarioDitial.model.Account;
import com.example.SistemabancarioDitial.model.Client;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TransactionDTO {
    private long idTransacao;
    private String tipoTrasacao;
    private double valorTransacao;
    private String dataHoraTransacao;
    private Client client;
    private Account client2;
    private String observacoes;
}
