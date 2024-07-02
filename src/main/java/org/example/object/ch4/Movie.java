package org.example.object.ch4;

import lombok.Getter;

import java.time.Duration;
import java.util.List;

@Getter
public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;
}
