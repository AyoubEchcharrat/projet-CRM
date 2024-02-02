package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/commandes")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getAll(){
        return ResponseEntity.ok(orderService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable("id") Integer id){
        if(orderService.getOne(id).isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(orderService.getOne(id).get());
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody Order order){
        orderService.add(order);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ajout d'une commande.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable("id") Integer id,@RequestBody Order order){
        if(!id.equals(order.getId())){
            return ResponseEntity.badRequest().body("Une erreur s'est produite. (IDs différents)");
        }
        orderService.update(order);
        return ResponseEntity.status(HttpStatus.CREATED).body("Modification de la commande enregistrée.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        orderService.delete(id);
        return ResponseEntity.ok("Suppression de la commande.");
    }
}
