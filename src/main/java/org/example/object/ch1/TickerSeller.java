package org.example.object.ch1;

public class TickerSeller {

    private TicketOffice ticketOffice;

    public TickerSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
