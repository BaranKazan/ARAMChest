package com.BaranKazan.ARAMChest.summoner;

import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.types.common.Region;
import org.springframework.stereotype.Service;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

@Service
public class SummonerService {

    public SummonerService() {
        Orianna.setRiotAPIKey("RGAPI-eb4c64de-78be-46aa-8cb7-86f0c04a83a7");
    }


    public Summoner getSummoner(String summonerName, Region region) {
        Summoner summoner = Summoner.named(summonerName).withRegion(region).get();
        //The code above wont recive data unless if I call the get method below. That is strange?
        summoner.getId();
        return summoner;
    }

}
