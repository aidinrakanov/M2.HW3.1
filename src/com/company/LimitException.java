package com.company;

public class LimitException extends Exception {
    public double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
        System.out.println("Остаток на счете: " + getRemainingAmount());
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
