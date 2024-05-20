package org.example.object.ch1;

public class Theater {

    private TickerSeller tickerSeller;

    public Theater(TickerSeller tickerSeller) {
        this.tickerSeller = tickerSeller;
    }

    public void enter(Audience audience) {

        if (audience.getBag().hasInvitation()) {
            Ticket ticket = tickerSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = tickerSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            tickerSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
