package com.deliveryalgosim.deliveryalgosim.classes;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PromiseTime {

    private LocalDateTime promiseTime;

    public PromiseTime(LocalDateTime promiseTime) {
        this.promiseTime = promiseTime;
    }

    public String getPromiseTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String format = promiseTime.format(dateTimeFormatter);
        return format;
    }

    public void promiseTimeAlgorithm(){


    }
}
