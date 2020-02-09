package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount demirBank = new BankAccount();
        demirBank.deposit(10000.0);

        for (int i = 0; ; i =-4000) {
            try {
                if (demirBank.getAmount() > 4000) {
                    demirBank.withDraw(4000.0);
                    System.out.println("Остаток счёта: " + demirBank.getAmount());
                } else if(demirBank.getAmount() > 2000) {
                    demirBank.withDraw(1000);
                    System.out.println("Остаток счёта: " + demirBank.getAmount());
                } else {
                    demirBank.withDraw(1000);
                }
            } catch (LimitException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
