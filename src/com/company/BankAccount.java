package com.company;

public class BankAccount {
    public double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println("сумма пополнения счета: " + amount);
        System.out.println("_________________________");
    }

    public void withDraw(double sum) throws LimitException {

        if (sum > amount) {
            throw new LimitException("запрашиваемая сумма на снятие больше чем остаток денег на счете", amount);
        }
        amount = getAmount() - sum;

        System.out.println("Сумма снятия со счета: " + sum);

        System.out.println("Остаток на счете: " + getAmount());

        System.out.println("_________________________");

        if (getAmount() < sum) {
            System.out.println("Сумма снятия со счета: " + getAmount());
            amount = getAmount() - getAmount();


        }
    }

}
/*try {
                if (demirBank.getAmount() > 4000.0) {
                    demirBank.withDraw(4000.0);
                    System.out.println("Остаток счёта: " + demirBank.getAmount());
                } else if(demirBank.getAmount() > 2000.0) {
                    demirBank.withDraw(1000.0);
                    System.out.println("Остаток счёта: " + demirBank.getAmount());
                } else {
                    demirBank.withDraw(1000.0);
                }
            } catch (LimitException e) {
                e.printStackTrace();
                break;
            }*/