package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount demirBank = new BankAccount();
        demirBank.deposit(10000.0);

        for (int i = 0; ; i = -2400) {
            try {
                demirBank.withDraw(2400.0);
            } catch (LimitException e) {

                e.printStackTrace();

                System.out.println(e.getMessage());
                break;
            }
        }
    }
}