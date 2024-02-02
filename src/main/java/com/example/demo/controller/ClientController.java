package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clients")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getAll(){
        return ResponseEntity.ok(clientService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable("id") Integer id){
        if(clientService.getOne(id).isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(clientService.getOne(id).get());
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody Client client){
        clientService.add(client);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ajout d'un client.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody Client client){
        clientService.update(client);
        return ResponseEntity.status(HttpStatus.CREATED).body("Modification du profil client enregistré.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        clientService.delete(id);
        return ResponseEntity.ok("Suppression du client.");
    }
}
