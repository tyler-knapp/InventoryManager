package com.philo.demo.account;

public class Account {

    double accountBalance;


    public double addMoneyToAccount(double moneyToAdd){
        if(moneyToAdd <= 5000 && moneyToAdd >= 0){
            this.accountBalance += moneyToAdd;
        } else {
            System.out.println("*****This is an invalid amount*****");
        }
        return this.accountBalance;
    }

    public double subtractMoneyFromAccount(double moneyToSubtract){
        if(this.accountBalance >= 0.0 && moneyToSubtract <= 5000 && moneyToSubtract >=0 && ((this.accountBalance - moneyToSubtract) >=0)) {
            this.accountBalance -= moneyToSubtract;
        } else {
            System.out.println("*****This is an invalid amount*****");
        }
        return this.accountBalance;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }


}
