package edu.ccp.hotel.domain;

public class Room {

    private final int roomNumber;
    private final RoomType roomType;

    public Room(int roomNumber, RoomType roomType) {
        if (roomNumber <= 0) {
            throw new IllegalArgumentException("Room number must be greater than zero");
        }
        if (roomType == null) {
            throw new IllegalArgumentException("Room type cannot be null");
        }
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
