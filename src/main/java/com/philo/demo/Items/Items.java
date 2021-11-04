package com.philo.demo.Items;

public abstract class Items {

    private String code;
    private String name;
    private double price;
    private String type;

    public Items(String code, String name, double price){
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
