package com.example.SistemabancarioDitial.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Table(name = "transactions")
@Setter
@Getter
@AllArgsConstructor
@Builder
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTransação", nullable = false)
    private long idTransação;


    @NotBlank(message = "O tipo de transação não pode estar em branco")
    @Column(name = "tipoTransação", nullable = false)
    private String tipoTransação; 


    @NotBlank(message = "O valor da transação não pode estar em branco")
    @Column(name = "valorTransação", nullable = false)
    private double valorTransação;


    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @NotBlank(message = "A data e hora da transação não pode estar em branco")
    @Column(name = "dataHoraTransação", nullable = false)
    private String dataHoraTransação;

    @ManyToOne
    @JoinColumn(name = "id_account_origem")
    private Client client;


    @ManyToOne
    @JoinColumn(name = "id_account_destino")
    private Account client2;


    @Size(max = 255, message = "As observações não podem exceder 255 caracteres")
    @Column(name = "observações")
    private String observações;
}

