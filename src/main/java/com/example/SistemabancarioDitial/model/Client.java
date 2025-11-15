package com.example.SistemabancarioDitial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;






}


// - id: identificador único
// - name: nome completo
// - cpf: número do CPF
// - email: e-mail
// - password: senha (criptografada)
// - dateOfBirth: data de nascimento
// - address: endereço completo
// - phone: telefone
