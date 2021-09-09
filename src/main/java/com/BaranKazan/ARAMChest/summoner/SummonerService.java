package com.BaranKazan.ARAMChest.summoner;

import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.types.common.Region;
import com.merakianalytics.orianna.types.core.championmastery.ChampionMasteries;
import com.merakianalytics.orianna.types.core.championmastery.ChampionMastery;
import com.merakianalytics.orianna.types.core.staticdata.Champion;
import org.springframework.stereotype.Service;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

@Service
public class SummonerService {

    public SummonerService() {
        Orianna.setRiotAPIKey("RGAPI-9c273842-5aa4-41a9-b4f8-45f6899a98de");
    }


    public void getAvalibleChest(String summonerName, Region region) {
        final Summoner summoner = Summoner.named(summonerName).withRegion(region).get();

        final ChampionMasteries cms = summoner.getChampionMasteries();

        for (ChampionMastery championMastery : cms) {
            System.out.println("Champion: "+championMastery.getChampion().getName()+" Chest Unlocked: "+championMastery.isChestGranted());
        }

        /*final Champion champion = Champion.named("Jhin").withRegion(region).get();
        final ChampionMastery cm = summoner.getChampionMastery(champion);
        System.out.println(champion.getId());
        System.out.println(cm.getPoints());
        System.out.println(cm.getLevel());*/

    }

}