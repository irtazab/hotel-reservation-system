package edu.ccp.hotel.value;

public class Money {

    private final double amount;

    public Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Money amount cannot be negative");
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
