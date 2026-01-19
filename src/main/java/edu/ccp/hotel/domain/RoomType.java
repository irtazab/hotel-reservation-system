package edu.ccp.hotel.domain;

import edu.ccp.hotel.enums.RoomKind;
import edu.ccp.hotel.value.Money;
import edu.ccp.hotel.value.Name;

public class RoomType {

    private final Name name;
    private final RoomKind kind;
    private final Money price;

    public RoomType(Name name, RoomKind kind, Money price) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (kind == null) {
            throw new IllegalArgumentException("Room kind cannot be null");
        }
        if (price == null) {
            throw new IllegalArgumentException("Price cannot be null");
        }
        this.name = name;
        this.kind = kind;
        this.price = price;
    }

    public Name getName() {
        return name;
    }

    public RoomKind getKind() {
        return kind;
    }

    public Money getPrice() {
        return price;
    }
}
