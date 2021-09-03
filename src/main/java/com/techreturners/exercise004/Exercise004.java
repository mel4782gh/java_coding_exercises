package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Exercise004 {

    private LocalDateTime datePlusGigaSecond;
    private final long gigasecond = 1000000000;

    public Exercise004(LocalDate date) {
        //store the date as LocalDateTime object which includes seconds
        LocalDateTime dt = date.atStartOfDay();
        //add the gigasecond to the date and store
        this.datePlusGigaSecond = dt.plusSeconds(gigasecond);
    }

    public Exercise004(LocalDateTime dateTime) {
        //add the gigasecond to the dateTime and store
        this.datePlusGigaSecond = dateTime.plusSeconds(gigasecond);
    }

    public LocalDateTime getDateTime() {
        return this.datePlusGigaSecond;
    }
}
