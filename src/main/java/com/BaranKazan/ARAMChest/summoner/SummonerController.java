package com.BaranKazan.ARAMChest.summoner;

import com.merakianalytics.orianna.types.common.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.merakianalytics.orianna.types.core.summoner.Summoner;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SummonerController {

    private final SummonerService summonerService;

    @Autowired
    public SummonerController(SummonerService summonerService) {
        this.summonerService = summonerService;
    }

    @RequestMapping(path = "/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @GetMapping(path = "/summonerName/{summonerName}/region/{region}")
    public Summoner getAvailableChampionChest(
            @PathVariable("summonerName") String summonerName,
            @PathVariable("region") Region region) {
        Summoner summoner = summonerService.getSummoner(summonerName, region);
        return summoner;
    }
}
