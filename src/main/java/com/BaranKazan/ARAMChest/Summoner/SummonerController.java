package com.BaranKazan.ARAMChest.Summoner;

import com.merakianalytics.orianna.types.common.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

@RestController
public class SummonerController {

    private final SummonerService summonerService;

    @Autowired
    public SummonerController(SummonerService summonerService) {
        this.summonerService = summonerService;
    }

    @GetMapping(path = "/summonerName/{summonerName}/region/{region}")
    public Summoner getAvailableChampionChest(
        @PathVariable("summonerName") String summonerName,
        @PathVariable("region") Region region){
        Summoner summoner = summonerService.getSummoner(summonerName, region);
        return summoner;
    }
}
