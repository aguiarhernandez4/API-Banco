package com.example.SistemabancarioDitial.dto;

import lombok.Data;

@Data
public class DepositRequest {
    private Long clientId;
    private Long accountId;
    private Double value;
}
