package edu.ccp.hotel.value;

public class Address {

    private final String value;

    public Address(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null or empty");
        }
        this.value = value.trim();
    }

    public String getValue() {
        return value;
    }
}
