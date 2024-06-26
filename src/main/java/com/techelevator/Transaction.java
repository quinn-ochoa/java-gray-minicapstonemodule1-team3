package com.techelevator;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.HashMap;
import java.util.Map;

public class Transaction {

    private double balance;
    private final double QUARTER = 0.25;
    private final double DIME = 0.10;
    private final double NICKEL = 0.05;

    public Transaction() {
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public double feedMoney(double moneyToAdd) {

        if(moneyToAdd > 0) {
            balance += moneyToAdd;
        }

        return balance;
    }

    public double subtractBalance(double moneyToSubtract) {

        if(moneyToSubtract <= balance) {
            balance -= moneyToSubtract;
        }

        return balance;
    }

    public Map<String, Integer> returnChange() {

        int count = 0;

        Map<String, Integer> change = new HashMap<>();

        if(balance >= QUARTER) {

            count = (int)(balance / QUARTER);
            change.put("Quarter", count);
            balance -= count * QUARTER;

        }

        if(balance >= DIME) {
            count = (int) (balance / DIME);
            change.put("Dime", count);
            balance -= count * DIME;
        }

        if(balance >= NICKEL) {
            count = (int) (balance / NICKEL);
            change.put("Nickel", count);
            balance -= count * NICKEL;
        }

        return change;

    }
}
