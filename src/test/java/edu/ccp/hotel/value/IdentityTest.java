package edu.ccp.hotel.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentityTest {

    @Test
    void shouldCreateValidIdentity() {
        Identity identity = new Identity("ID-123");
        assertEquals("ID-123", identity.getId());
    }

    @Test
    void shouldThrowExceptionForNullIdentity() {
        assertThrows(IllegalArgumentException.class, () -> new Identity(null));
    }

    @Test
    void shouldThrowExceptionForEmptyIdentity() {
        assertThrows(IllegalArgumentException.class, () -> new Identity("   "));
    }
}
