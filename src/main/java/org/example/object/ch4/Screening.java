package org.example.object.ch4;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;
}
