package com.example.SistemabancarioDitial.controller;

import com.example.SistemabancarioDitial.dto.AccountDTO;
import com.example.SistemabancarioDitial.model.Account;
import com.example.SistemabancarioDitial.repository.AccountRepository;
import com.example.SistemabancarioDitial.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountRepository accountRepo;


    @PostMapping("criarconta")
    public Account criarConta(@RequestBody AccountDTO dto){
        return accountService.salvarAccount(dto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> excluirConta(@PathVariable Long id){
        accountService.excluirConta(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/ListarContas")
    public List<Account> listarTodasAsContas(){
        return accountService.listarContas();
    }
}
