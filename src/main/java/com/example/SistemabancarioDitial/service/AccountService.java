package com.example.SistemabancarioDitial.service;

import com.example.SistemabancarioDitial.dto.AccountDTO;
import com.example.SistemabancarioDitial.model.Account;
import com.example.SistemabancarioDitial.repository.AccountRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@NoArgsConstructor
public class AccountService {

    @Autowired
    AccountRepository accountRepo;

    public Account salvarAccount(AccountDTO dto) {
        // Define o saldo inicial da conta como 0
        dto.setSaldo_atual(0.0);

        // Gera número de conta único
        Random random = new Random();
        long numeroConta;
        do {
            numeroConta = random.nextLong(100000, 999999);
        } while (accountRepo.existsByNumbercount(numeroConta));

        dto.setNumbercount(numeroConta);
        System.out.println("Número de conta gerado: " + numeroConta);

        // Cria a entidade Account
        Account account = Account.builder()
                .agency(dto.getAgency())
                .saldo_atual(dto.getSaldo_atual())
                .datacriacao_conta(dto.getDatacriacao_conta())
                .numbercount(dto.getNumbercount()) // não esquecer de setar o número!
                .build();

        return accountRepo.save(account);
    }

    @Transactional
    public void excluirConta(Long id) {
        Optional<Account> account = accountRepo.findById(id);
        if (account.isPresent()) {
            accountRepo.deleteById(id);
        } else {
            throw new RuntimeException("Conta não encontrada");
        }

    }

    public List<Account> listarContas() {
        return accountRepo.findAll();
    }

}