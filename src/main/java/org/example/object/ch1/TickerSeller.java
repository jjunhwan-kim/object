package org.example.object.ch1;

public class TickerSeller {

    private TicketOffice ticketOffice;

    public TickerSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
