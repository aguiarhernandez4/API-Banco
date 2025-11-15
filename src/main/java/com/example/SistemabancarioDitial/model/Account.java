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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Table(name = "Account")
@Builder
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "numbercount", nullable = false, unique = true)
    private long numbercount;

    @NotBlank(message="O número da agência não pode estar em branco")
    @Column(name = "agency", nullable = false)
    private String agency;

    @Column(name = "saldo_atual", nullable = false)
    private double saldo_atual;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "criação_cota", nullable = false)
    private String criacao_conta;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client id_client;

}


