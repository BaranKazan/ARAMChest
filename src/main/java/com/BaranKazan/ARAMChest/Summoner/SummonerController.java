package com.BaranKazan.ARAMChest.Summoner;

import com.BaranKazan.ARAMChest.Champion.Champion;
import com.BaranKazan.ARAMChest.Enum.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SummonerController {

    private final SummonerService summonerService;

    @Autowired
    public SummonerController(SummonerService summonerService) {
        this.summonerService = summonerService;
    }

    @GetMapping(path = "/summonerName/{summonerName}/region/{region}")
    public List<Champion> getAvailableChampionChest(
        @PathVariable("summonerName") String summonerName,
        @PathVariable("region") Region region){

        System.out.println(summonerName);
        System.out.println(region);
        Summoner summoner = new Summoner(summonerName, region);
        List<Champion> champions = summonerService.getAvailableChampionChest(summoner);
        return champions;
    }
}
