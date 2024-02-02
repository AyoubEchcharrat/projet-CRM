package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "type_presta")
    private String typePresta;
    private String designation;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @Column(name = "nb_days")
    private Short nbDays;
    @Column(name = "unit_price")
    private int unitPrice;
    @Column(name = "total_exclude_taxe")
    private int totalExcludeTaxe;
    @Column(name = "total_with_taxe")
    private int totalWithTaxe;
    private Short state;

    public Order() {
    }

    public Order(String typePresta, String designation, Client client, Short nbDays, int unitPrice, int totalExcludeTaxe, int totalWithTaxe, Short state) {
        this.typePresta = typePresta;
        this.designation = designation;
        this.client = client;
        this.nbDays = nbDays;
        this.unitPrice = unitPrice;
        this.totalExcludeTaxe = totalExcludeTaxe;
        this.totalWithTaxe = totalWithTaxe;
        this.state = state;
    }

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

    public int getNbDays() {
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

    public int getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }
}