package edu.ccp.hotel.domain;

import edu.ccp.hotel.value.Address;
import edu.ccp.hotel.value.Name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hotel {

    private final Name name;
    private final Address address;
    private final List<Room> rooms = new ArrayList<>();

    public Hotel(Name name, Address address) {
        if (name == null) {
            throw new IllegalArgumentException("Hotel name cannot be null");
        }
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        this.name = name;
        this.address = address;
    }

    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }
        rooms.add(room);
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<Room> getRooms() {
        return Collections.unmodifiableList(rooms);
    }
}
