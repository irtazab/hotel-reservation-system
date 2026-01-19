package edu.ccp.hotel.value;

public class Identity {

    private final String id;

    public Identity(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Identity cannot be null or empty");
        }
        this.id = id.trim();
    }

    public String getId() {
        return id;
    }
}
