package com.example.demo.model.dto;

import com.example.demo.model.Client;
import com.example.demo.model.OrderStateEnum;

public class OrderDto {

    private Integer id;
    private String typePresta;
    private String designation;
    private Client client;
    private Short nbDays;
    private int unitPrice;
    private int totalExcludeTaxe;
    private int totalWithTaxe;
    private OrderStateEnum state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypePresta() {
        return typePresta;
    }

    public void setTypePresta(String typePresta) {
        this.typePresta = typePresta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Short getNbDays() {
        return nbDays;
    }

    public void setNbDays(Short nbDays) {
        this.nbDays = nbDays;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalExcludeTaxe() {
        return totalExcludeTaxe;
    }

    public void setTotalExcludeTaxe(int totalExcludeTaxe) {
        this.totalExcludeTaxe = totalExcludeTaxe;
    }

    public int getTotalWithTaxe() {
        return totalWithTaxe;
    }

    public void setTotalWithTaxe(int totalWithTaxe) {
        this.totalWithTaxe = totalWithTaxe;
    }

    public OrderStateEnum getState() {
        return state;
    }

    public void setState(OrderStateEnum state) {
        this.state = state;
    }
}
