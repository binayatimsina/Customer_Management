package com.example.webclient;

public class Customer {
    private Long id;
    private String name;
    private double total_sales;
    private double balance_due;
    
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
        return this.total_sales;
    }

    public void setTotalSales(double totalSales) {
        this.total_sales = totalSales;
    }

    public double getBalanceDue() {
        return this.balance_due;
    }

    public void setBalanceDue(double balanceDue) {
        this.balance_due = balanceDue;
    }
}
