package org.example.object.ch14.refactor;

import org.example.object.ch14.Call;
import org.example.object.ch14.Money;

public class FeeRule {

    private FeeCondition feeCondition;
    private FeePerDuration feePerDuration;

    public Money calculateFee(Call call) {
        return feeCondition.findTimeIntervals(call)
                .stream()
                .map(each -> feePerDuration.calculate(each))
                .reduce(Money.ZERO, Money::plus);
    }
}
