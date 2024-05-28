package org.learning.ticket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void validatePositiveNum() {
        assertThrows(IllegalArgumentException.class, ()-> new Ticket(4, -10));
        assertThrows(IllegalArgumentException.class, ()-> new Ticket(-3, 5));
        assertThrows(IllegalArgumentException.class, ()-> new Ticket(-55, -11));
    }

    @Test
    void getTicketPrice() {
        Ticket ticketBase = new Ticket(5,40);
        assertEquals(1.05, ticketBase.getTicketPrice());
        Ticket ticket18 = new Ticket(5,14);
        assertEquals(0.84, ticket18.getTicketPrice(),0.0001);
        Ticket ticket65 = new Ticket(5,70);
        assertEquals(0.63, ticket65.getTicketPrice());
    }
}