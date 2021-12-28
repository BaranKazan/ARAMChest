package com.BaranKazan.ARAMChest.exception;

import com.merakianalytics.orianna.types.core.summoner.Summoner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class SummonerExceptionHandler {

    @ExceptionHandler(value = {SummonerNotFoundException.class})
    public ResponseEntity<Object> handleSummonerNotFoundException(SummonerNotFoundException e){

        HttpStatus notFound = HttpStatus.NOT_FOUND;

        SummonerException summonerException = new SummonerException(
                e.getMessage(),
                notFound,
                ZonedDateTime.now(ZoneId.of("Z"))
        );

        return new ResponseEntity<>(summonerException, notFound);
    }
}
