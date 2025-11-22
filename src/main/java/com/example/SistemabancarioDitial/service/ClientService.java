package com.example.SistemabancarioDitial.service;

import com.example.SistemabancarioDitial.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SistemabancarioDitial.repository.ClientRepository;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepo;

//    public Client save(Client dto) {
//        Client client = new Client();
//        client.setName(dto.getName());
//        client.setEmail(dto.getEmail());
//        client.setCpf(dto.getCpf());
//        client.setEndereco(dto.getEndereco());
//        client.setTelefone(dto.getTelefone());
//        client.setDatanascimento(dto.getDatanascimento());
//        client.setPassword(dto.getPassword());
//        return clientRepo.save(client);
//    }

    public Client salvar(Client client) {
        return clientRepo.save(client);
    }

}
