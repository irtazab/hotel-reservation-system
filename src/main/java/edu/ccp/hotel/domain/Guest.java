package edu.ccp.hotel.domain;

import edu.ccp.hotel.value.Identity;
import edu.ccp.hotel.value.Name;

public class Guest {

    private final Name name;
    private final Identity identity;
// Guest must not be created without a valid identity

    public Guest(Name name, Identity identity) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (identity == null) {
            throw new IllegalArgumentException("Identity cannot be null");
        }
        this.name = name;
        this.identity = identity;
    }

    public Name getName() {
        return name;
    }

    public Identity getIdentity() {
        return identity;
    }
}
