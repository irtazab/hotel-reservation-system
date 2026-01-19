package edu.ccp.hotel.value;

public class CreditCard {

    private final String number;

    public CreditCard(String number) {
        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException("Credit card number cannot be null or empty");
        }
        this.number = number.trim();
    }

    public String getNumber() {
        return number;
    }
}
