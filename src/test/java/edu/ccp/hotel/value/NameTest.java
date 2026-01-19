package edu.ccp.hotel.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    void shouldCreateValidName() {
        Name name = new Name("Ali");
        assertEquals("Ali", name.getValue());
    }

    @Test
    void shouldThrowExceptionForNullName() {
        assertThrows(IllegalArgumentException.class, () -> new Name(null));
    }

    @Test
    void shouldThrowExceptionForEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> new Name("   "));
    }
}
