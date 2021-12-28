package com.BaranKazan.ARAMChest.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class SummonerException {

    private final String message;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timeStamp;

    public SummonerException(String message, HttpStatus httpStatus, ZonedDateTime timeStamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }
}
