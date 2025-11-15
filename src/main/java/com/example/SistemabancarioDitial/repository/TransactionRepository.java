package com.example.SistemabancarioDitial.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SistemabancarioDitial.model.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
