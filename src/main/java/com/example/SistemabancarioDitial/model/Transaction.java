package com.example.SistemabancarioDitial.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
    private Client idClient;



    @ManyToOne
    @JoinColumn(name = "id_account_destino")    
    private Account id_account;


    @Size(max = 255, message = "As observações não podem exceder 255 caracteres")
    @Column(name = "observações")
    private String observações;
}

