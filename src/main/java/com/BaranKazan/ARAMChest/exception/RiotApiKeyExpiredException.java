package com.BaranKazan.ARAMChest.exception;

public class RiotApiKeyExpiredException extends RuntimeException{

    public RiotApiKeyExpiredException(String message) {
        super(message);
    }

    public RiotApiKeyExpiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
