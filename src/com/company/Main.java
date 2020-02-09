package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount demirBank = new BankAccount();
        demirBank.deposit(10000.0);

        for (double i =0.0; i < demirBank.getAmount(); i=- 4000) {

                try {
                    if (demirBank.getAmount() < 4000.0)
                    demirBank.WithDraw(4000.0);
                    System.out.println("остаток на счете: " + demirBank.getAmount());
                }
                    catch (LimitException e) {
                    e.printStackTrace();
                }
        }
    }
}
