package edu.ccp.hotel.domain;

import edu.ccp.hotel.value.Name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelChain {

    private final Name name;
    private final List<Hotel> hotels = new ArrayList<>();

    public HotelChain(Name name) {
        if (name == null) {
            throw new IllegalArgumentException("Hotel chain name cannot be null");
        }
        this.name = name;
    }

    public void addHotel(Hotel hotel) {
        if (hotel == null) {
            throw new IllegalArgumentException("Hotel cannot be null");
        }
        hotels.add(hotel);
    }

    public Name getName() {
        return name;
    }

    public List<Hotel> getHotels() {
        return Collections.unmodifiableList(hotels);
    }
}
