package com.example.SistemabancarioDitial.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;


import jakarta.validation.constraints.NotBlank;


@Table(name = "Account")
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
    private Client client;

}


