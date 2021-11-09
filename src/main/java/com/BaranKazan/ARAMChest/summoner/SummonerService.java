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
import java.util.Map;

@Service
public class SummonerService {

    public SummonerService() {
        Map<String, String> env = System.getenv();
        String key = env.get("RIOT_API_KEY");
        Orianna.setRiotAPIKey(key);
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