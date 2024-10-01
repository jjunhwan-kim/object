package org.example.object.ch14.refactor;

import org.example.object.ch14.DateTimeInterval;
import org.example.object.ch14.Money;

import java.time.Duration;

public class FeePerDuration {
    private Money fee;
    private Duration duration;

    public FeePerDuration(Money fee, Duration duration) {
        this.fee = fee;
        this.duration = duration;
    }

    public Money calculate(DateTimeInterval interval) {
        return fee.times(Math.ceil((double) interval.duration().toNanos() / duration.toNanos()));
    }
}
