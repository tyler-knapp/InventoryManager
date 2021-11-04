package com.philo.demo.view;

import com.philo.demo.Items.Items;

import java.util.Map;
import java.util.TreeMap;

public class Inventory {


    private Map<String, Integer> items;
    private int quantity = 50;

    public Inventory(Map<String,Integer> items){
        this.items = items;
    }

    //Maybe add logic to not dip below certain inventory levels
    public Map<String, Integer> reduceInventoryLevels(String code, int quantityToSubtract){
       this.items.replace(code, this.quantity, (this.quantity - quantityToSubtract));
       return this.items;
    }


}
