package com.philo.demo;

import com.philo.demo.account.Account;
import com.philo.demo.filereader.FileReader;
import com.philo.demo.view.Inventory;
import com.philo.demo.Items.Items;
import com.philo.demo.view.Menu;

import java.util.Map;


public class Main {

    private static final String FIRST_MENU_OPTION_ONE = "1";
    private static final String FIRST_MENU_OPTION_TWO = "2";
    private static final String FIRST_MENU_OPTION_THREE = "3";

    private static final String ACCOUNT_MENU_OPTION_ONE = "1";
    private static final String ACCOUNT_MENU_OPTION_TWO = "2";
    private static final String ACCOUNT_MENU_OPTION_THREE = "3";

    private static Menu menu = new Menu();
    private static FileReader fileReader = new FileReader();
    private static Account account = new Account();
    private static Inventory inventory;
    private Items items;


    public static void run() {
        menu.welcomeMessage();


        String filePath = menu.receiveFilePathFromUser();


        while(true){
            String userChoice = menu.menuOptionSetOneUserChoice();
            if(userChoice.equalsIgnoreCase(FIRST_MENU_OPTION_ONE)){
                menu.showAccountBalance(account);
                while(true){
                    userChoice = menu.accountBalanceOptions();
                        if(userChoice.equalsIgnoreCase(ACCOUNT_MENU_OPTION_ONE)){
                            double moneyToTransact = menu.howMuchMoneyToAddOrSubtract();
                            account.addMoneyToAccount(moneyToTransact);
                            menu.showUpdatedAccountBalance(account);
                            break;
                        }else if(userChoice.equalsIgnoreCase(ACCOUNT_MENU_OPTION_TWO)){
                            double moneyToTransact = menu.howMuchMoneyToAddOrSubtract();
                            account.addMoneyToAccount(moneyToTransact);
                            menu.showUpdatedAccountBalance(account);
                            break;
                        } else if(userChoice.equalsIgnoreCase(ACCOUNT_MENU_OPTION_THREE)){
                            break;
                        }
                }
            } else if (userChoice.equalsIgnoreCase(FIRST_MENU_OPTION_TWO)) {
                Map<String, Items> items = fileReader.read(filePath);
                menu.displaysAllItems(items);
                menu.inventoryMenuSelection();
            } else if (userChoice.equalsIgnoreCase(FIRST_MENU_OPTION_THREE)) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
