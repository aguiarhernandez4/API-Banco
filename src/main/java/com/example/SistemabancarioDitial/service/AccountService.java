package com.example.SistemabancarioDitial.service;

import com.example.SistemabancarioDitial.dto.AccountDTO;
import com.example.SistemabancarioDitial.model.Account;
import com.example.SistemabancarioDitial.repository.AccountRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class AccountService {

    @Autowired
    AccountRepository accountRepo;

    public Account salvarAccount(AccountDTO dto) {

        AccountDTO accountdto = new AccountDTO();
        accountdto.setSaldo_atual(0.0);


        Account account = Account.builder()
                .numbercount(dto.getNumbercount())
                .agency(dto.getAgency())
                .saldo_atual(dto.getSaldo_atual())
                .datacriacao_conta(dto.getDatacriacao_conta())
                .build();

        return accountRepo.save(account);
    }


}
