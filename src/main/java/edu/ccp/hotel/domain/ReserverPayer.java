package edu.ccp.hotel.domain;

import edu.ccp.hotel.value.CreditCard;
import edu.ccp.hotel.value.Name;

public class ReserverPayer {

    private final Name name;
    private final CreditCard creditCard;

    public ReserverPayer(Name name, CreditCard creditCard) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (creditCard == null) {
            throw new IllegalArgumentException("Credit card cannot be null");
        }
        this.name = name;
        this.creditCard = creditCard;
    }

    public Name getName() {
        return name;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
}
