package com.company;

public class BankAccount {
    public double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit (double sum){
        amount = amount + sum;
        System.out.println("сумма пополнения счета: " + amount);
    }
    public void WithDraw(double sum) throws LimitException {
        if(sum > amount){
            throw new LimitException("запрашиваемая сумма на снятие больше чем остаток денег на счете", amount);
        }
        amount = amount - sum;
        System.out.println("Сумма снятия со счета: " + sum);

    }
}
