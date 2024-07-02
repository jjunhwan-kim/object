package org.example.object.ch4;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }


    public Money calculateFee(int audienceCount) {
        switch (movie.getMovieType()) {
            case AMOUNT_DISCOUNT:
                if (movie.isDiscountable(whenScreened, sequence)) {
                    return movie.calculateAmountDiscountedFee().times(audienceCount);
                }
            case PERCENT_DISCOUNT:
                if (movie.isDiscountable(whenScreened, sequence)) {
                    return movie.calculatePercentDiscountedFee().times(audienceCount);
                }
            case NONE_DISCOUNT:
                return movie.calculateNoneDiscountedFee().times(audienceCount);
        }

        return movie.calculateNoneDiscountedFee().times(audienceCount);
    }
}
