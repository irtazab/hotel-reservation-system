package edu.ccp.hotel.value;

public class Name {

    private final String value;
// Value object representing a validated name

    public Name(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.value = value.trim();
    }

    public String getValue() {
        return value;
    }
}
