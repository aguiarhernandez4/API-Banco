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

        AccountDTO accountdto = new AccountDTO();
        accountdto.setSaldo_atual(0.0);

        Random numbercount = new Random();
        long numeroConta = numbercount.nextLong(100000, 999999);

        dto.setNumbercount(numeroConta);

        Account account = Account.builder()
                .numbercount(dto.getNumbercount())
                .agency(dto.getAgency())
                .saldo_atual(dto.getSaldo_atual())
                .datacriacao_conta(dto.getDatacriacao_conta())
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