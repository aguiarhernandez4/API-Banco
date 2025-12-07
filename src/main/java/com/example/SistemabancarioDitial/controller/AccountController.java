package com.example.SistemabancarioDitial.controller;

import com.example.SistemabancarioDitial.dto.AccountDTO;
import com.example.SistemabancarioDitial.model.Account;
import com.example.SistemabancarioDitial.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("criarconta")
    public Account criarConta(@RequestBody AccountDTO dto){
        return accountService.salvarAccount(dto);
    }

}
