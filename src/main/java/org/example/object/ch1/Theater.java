package org.example.object.ch1;

public class Theater {

    private TickerSeller tickerSeller;

    public Theater(TickerSeller tickerSeller) {
        this.tickerSeller = tickerSeller;
    }

    public void enter(Audience audience) {
        tickerSeller.sellTo(audience);
    }
}
