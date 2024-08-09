package com.example.webclient;

public class Customer {
    private Long id;
    private String name;
    private double totalSales;
    private double balanceDue;
    
    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getTotalSales() {
        return this.totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBalanceDue() {
        return this.balanceDue;
    }

    public void setBalanceDue(double balanceDue) {
        this.balanceDue = balanceDue;
    }
}
