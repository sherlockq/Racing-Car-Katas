package tddmicroexercises.turnticketdispenser;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketDispenserShould {

    TurnNumberSequence turnNumberSequence;

    @Before
    public void setUp() {
        turnNumberSequence = new TurnNumberSequence();
    }

    @Test
    public void return_ticket() {
        TicketDispenser ticketDispenser = new TicketDispenser(turnNumberSequence);
        TurnTicket turnTicket = ticketDispenser.getTurnTicket();

        assertEquals(0, turnTicket.getTurnNumber());

    }

    @Test
    public void return_ticket_twice_from_same_machine() {
        TicketDispenser ticketDispenser = new TicketDispenser(turnNumberSequence);
        // return 0
        TurnTicket turnTicket = ticketDispenser.getTurnTicket();
        // return 1
        turnTicket = ticketDispenser.getTurnTicket();

        assertEquals(1, turnTicket.getTurnNumber());

    }

    @Test
    public void return_ticket_from_two_dispensers() {
        TicketDispenser ticketDispenser1 = new TicketDispenser(turnNumberSequence);
        TicketDispenser ticketDispenser2 = new TicketDispenser(turnNumberSequence);
        TurnTicket turnTicketFromDispenser1 = ticketDispenser1.getTurnTicket();
        TurnTicket turnTicketFromDispenser2 = ticketDispenser2.getTurnTicket();

        assertEquals(0, turnTicketFromDispenser1.getTurnNumber());
        assertEquals(1, turnTicketFromDispenser2.getTurnNumber());

    }
}
