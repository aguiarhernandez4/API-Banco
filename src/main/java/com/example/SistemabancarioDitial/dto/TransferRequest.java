package com.example.SistemabancarioDitial.dto;

import com.example.SistemabancarioDitial.model.Account;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TransferRequest {
    private TransactionDTO tipoTrasacao;
    private ClientDTO client;
    private Account client2;
    private TransactionDTO valorTransacao;
}
