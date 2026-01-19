package edu.ccp.hotel.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void shouldCreateValidMoney() {
        Money money = new Money(1000);
        assertEquals(1000, money.getAmount());
    }

    @Test
    void shouldThrowExceptionForNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> new Money(-1));
    }
}
