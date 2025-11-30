package com.example.SistemabancarioDitial.service;

import com.example.SistemabancarioDitial.dto.ClientDTO;
import com.example.SistemabancarioDitial.model.Client;
import com.example.SistemabancarioDitial.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.SistemabancarioDitial.repository.ClientRepository;
import org.springframework.web.client.RestClient;

import javax.sql.DataSource;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepo;

    @Autowired
    private RestClient.Builder builder;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Client salvar(ClientDTO dto) {

        String cpfLimpo = dto.getCpf().replaceAll("\\D", "");
        String telefoneLimpo = dto.getTelefone().replaceAll("\\D", "");
        User user = new User();
//        user.setPassword(passwordEncoder.encode(user.getPassword()));

        Client client = Client.builder()
                .name(dto.getName())
                .cpf(cpfLimpo)
                .email(dto.getEmail())
                .password(dto.getPassword())
                .datanascimento(dto.getDatanascimento())
                .endereco(dto.getEndereco())
                .telefone(telefoneLimpo)
                .build();

        return clientRepo.save(client);
    }



}
