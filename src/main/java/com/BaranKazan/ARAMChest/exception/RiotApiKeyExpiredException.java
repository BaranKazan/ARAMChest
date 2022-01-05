package com.BaranKazan.ARAMChest.exception;

import com.merakianalytics.orianna.datapipeline.riotapi.exceptions.ForbiddenException;

public class RiotApiKeyExpiredException extends ForbiddenException {

    public RiotApiKeyExpiredException(String message) {
        super(message);
    }
}
