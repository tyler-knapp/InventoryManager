package com.philo.demo;

import com.philo.demo.account.Account;
import com.philo.demo.filereader.FileReader;
import com.philo.demo.view.Inventory;
import com.philo.demo.Items.Items;
import com.philo.demo.view.Menu;

import java.util.Map;


public class Main {

    private static Menu menu = new Menu();
    private static FileReader fileReader = new FileReader();
    private static Account account = new Account();
    private static Inventory inventory;
    private Items items;


    public static void run(){
        menu.welcomeMessage();

        String filePath = menu.receiveFilePathFromUser();
        String optionOne = menu.menuOptionSetOneUserChoice();

            while(true){

                phase:
                if(optionOne.equalsIgnoreCase("1")){
                    menu.showAccountBalance(account);
                    String accountMenuOption = menu.accountBalanceOptions();

                while(optionOne.equalsIgnoreCase("1")){
                    if(accountMenuOption.equalsIgnoreCase("1")){
                        account.addMoneyToAccount(menu.howMuchMoneyToAddOrSubtract());
                        menu.showAccountBalance(account);
                        break;
                    }
                    if(accountMenuOption.equalsIgnoreCase("2")){
                        account.subtractMoneyFromAccount(menu.howMuchMoneyToAddOrSubtract());
                        menu.showAccountBalance(account);
                        break;
                    }
                    if(accountMenuOption.equalsIgnoreCase("3")){
                        break phase;
                    }
                }
                }
                if(optionOne.equalsIgnoreCase("2")){
                    Map<String, Items>  items = fileReader.read(filePath);
                    menu.displaysAllItems(items);
                    menu.inventoryMenuSelection();

                }
                if(optionOne.equalsIgnoreCase("3")){
                    break;
                }

            }

    }

    public static void main(String[] args) {
        run();
    }
}
