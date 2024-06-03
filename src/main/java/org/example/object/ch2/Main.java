package org.example.object.ch2;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {

        Movie avatar = new Movie("아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(Money.wons(800),
                        new SequenceCondition(1)));

        avatar.changeDiscountPolicy(new PercentDiscountPolicy(0.1, new SequenceCondition(1)));
    }
}
