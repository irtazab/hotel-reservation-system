package edu.ccp.hotel.domain;

import edu.ccp.hotel.value.Identity;
import edu.ccp.hotel.value.Name;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    void shouldCreateValidGuest() {
        Guest guest = new Guest(
                new Name("Ali"),
                new Identity("ID-001")
        );

        assertEquals("Ali", guest.getName().getValue());
        assertEquals("ID-001", guest.getIdentity().getId());
    }

    @Test
    void shouldThrowExceptionForNullName() {
        assertThrows(IllegalArgumentException.class, () ->
                new Guest(null, new Identity("ID-001"))
        );
    }

    @Test
    void shouldThrowExceptionForNullIdentity() {
        assertThrows(IllegalArgumentException.class, () ->
                new Guest(new Name("Ali"), null)
        );
    }
}
