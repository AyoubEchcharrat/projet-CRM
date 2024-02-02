package com.example.demo.service;

import com.example.demo.dao.OrderDao;
import com.example.demo.model.Client;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    public void add(Order order){
        orderDao.save(order);
    }

    public List<Order> getAll(){
        return orderDao.findAll();
    }

    public Optional<Order> getOne(Integer id){
        return orderDao.findById(id);
    }

    public void delete(Integer id){
        orderDao.deleteById(id);
    }

    public void update(Order order){
        orderDao.save(order);
    }

}
