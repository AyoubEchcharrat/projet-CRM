package com.example.demo.service;

import com.example.demo.dao.ClientDao;
import com.example.demo.dao.OrderDao;
import com.example.demo.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientDao clientDao;

    public void add(Client client){
        clientDao.save(client);
    }

    public List<Client> getAll(){
        return clientDao.findAll();
    }

    public Optional<Client> getOne(Integer id){
        return clientDao.findById(id);
    }

    public void delete(Integer id){
        clientDao.deleteById(id);
    }

    public void update(Client client){
        clientDao.save(client);
    }
}
