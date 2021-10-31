package com.BaranKazan.ARAMChest.summoner;

import com.BaranKazan.ARAMChest.Champion.Champion;
import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.types.common.Region;
import com.merakianalytics.orianna.types.core.championmastery.ChampionMasteries;
import com.merakianalytics.orianna.types.core.championmastery.ChampionMastery;
import org.springframework.stereotype.Service;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

import java.util.ArrayList;
import java.util.List;

@Service
public class SummonerService {

    public SummonerService() {
        Orianna.setRiotAPIKey("RGAPI-b89f4d94-2d44-4728-ade9-517650010fa7");
    }


    public List<Champion> getAvalibleChest(String summonerName, Region region) {

        final Summoner summoner = Summoner.named(summonerName).withRegion(region).get();
        final ChampionMasteries cms = summoner.getChampionMasteries();

        List<Champion> champions = new ArrayList<>();

        for (ChampionMastery championMastery : cms) {
            champions.add(new Champion(
               championMastery.getChampion().getId(),
               championMastery.getChampion().getName(),
               championMastery.isChestGranted()
            ));
        }
        return champions;
    }

}