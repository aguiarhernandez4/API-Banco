    package com.example.SistemabancarioDitial.controller;

    import com.example.SistemabancarioDitial.dto.ClientDTO;
    import com.example.SistemabancarioDitial.model.Client;
    import com.example.SistemabancarioDitial.service.ClientService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/clients")
    public class ClientController {

        @Autowired
        ClientService clientService;

        @PostMapping("/criarCliente")
        public Client criar(@RequestBody ClientDTO dto) {
            return clientService.salvar(dto);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
            clientService.excluirClient(id);
            return ResponseEntity.noContent().build();
        }
    }