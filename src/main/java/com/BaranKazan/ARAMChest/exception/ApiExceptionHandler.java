package com.BaranKazan.ARAMChest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {SummonerNotFoundException.class})
    public ResponseEntity<Object> handleSummonerNotFoundException(SummonerNotFoundException e) {
        HttpStatus notFound = HttpStatus.NOT_FOUND;
        ApiException apiException = new ApiException(
                notFound,
                e.getMessage(),
                ZonedDateTime.now(ZoneId.of("Z"))
        );

            return new ResponseEntity<>(apiException, notFound);
    }

    @ExceptionHandler(value = RiotApiKeyExpiredException.class)
    public ResponseEntity<Object> handleRiotApiKeyExpiredException(RiotApiKeyExpiredException e) {
        HttpStatus serviceUnavailable = HttpStatus.SERVICE_UNAVAILABLE;
        ApiException apiException = new ApiException(
                serviceUnavailable,
                e.getMessage(),
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiException, serviceUnavailable);
    }
}
