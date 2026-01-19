package edu.ccp.hotel.app;

import edu.ccp.hotel.domain.*;
import edu.ccp.hotel.enums.RoomKind;
import edu.ccp.hotel.value.*;

public class Main {

    public static void main(String[] args) {

        // 1. Create Hotel Chain
        HotelChain chain = new HotelChain(new Name("Luxury Stay Group"));

        // 2. Create Hotel
        Hotel hotel = new Hotel(
                new Name("Grand Palace Hotel"),
                new Address("Main Boulevard, City Center")
        );
        chain.addHotel(hotel);

        // 3. Create Room Type
        RoomType deluxeRoom = new RoomType(
                new Name("Deluxe Room"),
                RoomKind.DOUBLE,
                new Money(15000)
        );

        // 4. Create Room
        Room room101 = new Room(101, deluxeRoom);
        hotel.addRoom(room101);

        // 5. Create Guest
        Guest guest = new Guest(
                new Name("Ali Khan"),
                new Identity("CNIC-12345")
        );

        // 6. Create Reserver / Payer
        ReserverPayer payer = new ReserverPayer(
                new Name("Ali Khan"),
                new CreditCard("4111-1111-1111-1111")
        );

        // 7. Create Reservation
        Reservation reservation = new Reservation(
                guest,
                payer,
                room101,
                new HowMany(2),
                new Money(30000)
        );

        // 8. Print output (for screenshot evidence)
        System.out.println("Hotel Chain: " + chain.getName().getValue());
        System.out.println("Hotel: " + hotel.getName().getValue());
        System.out.println("Room Type: " + deluxeRoom.getName().getValue());
        System.out.println("Room Number: " + room101.getRoomNumber());
        System.out.println("Guest: " + guest.getName().getValue());
        System.out.println("Reservation created successfully.");
        System.out.println("Total Cost: " + reservation.getTotalCost().getAmount());
    }
}
