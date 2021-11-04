package com.philo.demo;

import com.philo.demo.Items.Items;

import java.util.Map;

public class Cart {

    private Map<Items, Integer> cartContents = null;
    private int itemQuantity = 0;

    public void addItemToShoppingCart(int quantityOfItemToAdd){
        this.itemQuantity += quantityOfItemToAdd;

    }

    public void removeItemFromShoppingCart(int quantityOfItemToSubtract){
        this.itemQuantity -= quantityOfItemToSubtract;
    }
}
