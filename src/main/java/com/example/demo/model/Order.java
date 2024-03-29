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
    @Transient
    private int totalExcludeTaxe;
    @Column(name = "total_with_taxe")
    @Transient
    private int totalWithTaxe;
    @Column(columnDefinition = "int4")
    private OrderStateEnum state;

    public Order() {
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


    public OrderStateEnum getState() {
        return state;
    }

    public void setState(OrderStateEnum state) {
        this.state = state;
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
}