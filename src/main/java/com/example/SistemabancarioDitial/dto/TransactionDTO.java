package com.example.SistemabancarioDitial.dto;

import com.example.SistemabancarioDitial.model.Account;
import com.example.SistemabancarioDitial.model.Client;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TransactionDTO {
    private long idTransação;
    private String tipoTrasação;
    private double valorTransação;
    private String dataHoraTransação;
    private Client client;
    private Account client2;
    private String observações;
}
