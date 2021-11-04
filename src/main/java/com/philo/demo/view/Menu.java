package com.philo.demo.view;

import com.philo.demo.account.Account;
import com.philo.demo.Items.Items;
import com.philo.demo.LogWriter;

import java.util.Map;
import java.util.Scanner;

public class Menu {

    private static final Scanner in = new Scanner(System.in);
    private LogWriter logger = new LogWriter();

    public void welcomeMessage(){
        System.out.println();
        System.out.println("Welcome to the most magical place on Earth!");
        System.out.println();
        System.out.println("************************************");
        System.out.println("**********PHILO DELIGHT*************");
        System.out.println("************************************");
        System.out.println();
    }

    public String receiveFilePathFromUser(){
        System.out.println("Please enter the path of the inventory file");
        System.out.println();
        return in.nextLine();
    }

    public String accountBalanceOptions(){
        System.out.println("What would you like to do next?");
        System.out.println();
        System.out.println("1) Add money to account");
        System.out.println("2) Subtract money from account");
        System.out.println("3) Return to Previous Menu");
        return in.nextLine();
    }

    public void showAccountBalance(Account account){
        System.out.println("Current money in account is: " + account.getAccountBalance());
    }

    //Format this to be easier on the eyes
    //Format Spacing and format the double to be 2 digits
    public void displaysAllItems(Map<String, Items> map){
        System.out.println("-----------------------------------------------");
        System.out.println("List of Items     Code       Name       Price");
        System.out.println("-----------------------------------------------");
        for(String key: map.keySet()){
            System.out.println(map.get(key).getCode() + " " + map.get(key).getPrice()+ " " + map.get(key).getPrice() );
            System.out.println();
        }
    }

    public String inventoryMenuSelection(){
        System.out.println();
        System.out.println("What would you like to do next? ");
        System.out.println();
        System.out.println("1) Add quantity to cart");
        System.out.println("2) Take item out of cart");
        System.out.println("3) View inventory levels");
        System.out.println("4) Return to previous menu");
        return in.nextLine();
    }

    public double howMuchMoneyToAddOrSubtract(){
        System.out.println("Please enter an amount: ");
        System.out.println();
        return Double.parseDouble(in.nextLine());
    }

    public String menuOptionSetOneUserChoice(){
        System.out.println("Please select between the options below.");
        System.out.println();
        System.out.println("1) Get Account Balance");
        System.out.println("2) View Inventory");
        System.out.println("3) Exit");

        return in.nextLine();
    }






}
