package com.BaranKazan.ARAMChest.Summoner;

import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.types.common.Region;
import org.springframework.stereotype.Service;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

@Service
public class SummonerService {

    public SummonerService() {
        Orianna.setRiotAPIKey("RGAPI-5830f40b-76b4-4dcc-b08a-8fc123544401");
    }


    public Summoner getSummoner(String summonerName, Region region) {
        Summoner summoner = Summoner.named(summonerName).withRegion(region).get();
        //The code above wont recive data unless if I call the get method below. That is strange?
        summoner.getId();
        return summoner;
    }

}
