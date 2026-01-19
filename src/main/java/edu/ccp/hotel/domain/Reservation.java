package edu.ccp.hotel.domain;

import edu.ccp.hotel.value.HowMany;
import edu.ccp.hotel.value.Money;

public class Reservation {

    private final Guest guest;
    private final ReserverPayer reserverPayer;
    private final Room room;
    private final HowMany howMany;
    private final Money totalCost;

    public Reservation(Guest guest,
                       ReserverPayer reserverPayer,
                       Room room,
                       HowMany howMany,
                       Money totalCost) {

        if (guest == null) {
            throw new IllegalArgumentException("Guest cannot be null");
        }
        if (reserverPayer == null) {
            throw new IllegalArgumentException("ReserverPayer cannot be null");
        }
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }
        if (howMany == null) {
            throw new IllegalArgumentException("HowMany cannot be null");
        }
        if (totalCost == null) {
            throw new IllegalArgumentException("Total cost cannot be null");
        }

        this.guest = guest;
        this.reserverPayer = reserverPayer;
        this.room = room;
        this.howMany = howMany;
        this.totalCost = totalCost;
    }

    public Guest getGuest() {
        return guest;
    }

    public ReserverPayer getReserverPayer() {
        return reserverPayer;
    }

    public Room getRoom() {
        return room;
    }

    public HowMany getHowMany() {
        return howMany;
    }

    public Money getTotalCost() {
        return totalCost;
    }
}
