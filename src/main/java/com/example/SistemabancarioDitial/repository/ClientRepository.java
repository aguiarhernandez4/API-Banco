package com.example.SistemabancarioDitial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SistemabancarioDitial.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Object>{

}
