package com.BaranKazan.ARAMChest.summoner;

import com.merakianalytics.orianna.types.common.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    public MySummoner getAvailableChampionChest(
            @PathVariable("summonerName") String summonerName,
            @PathVariable("region") Region region) {
        return summonerService.getAvalibleChest(summonerName, region);
    }
}
