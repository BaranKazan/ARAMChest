package com.BaranKazan.ARAMChest.summoner;

import com.BaranKazan.ARAMChest.champion.Champion;
import com.BaranKazan.ARAMChest.exception.RiotApiKeyExpiredException;
import com.BaranKazan.ARAMChest.exception.SummonerNotFoundException;
import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.datapipeline.riotapi.exceptions.ForbiddenException;
import com.merakianalytics.orianna.types.common.Region;
import com.merakianalytics.orianna.types.core.championmastery.ChampionMasteries;
import com.merakianalytics.orianna.types.core.championmastery.ChampionMastery;
import org.springframework.stereotype.Service;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

import java.util.HashSet;

@Service
public class SummonerService {

    public SummonerService() {
        String key = System.getenv("RIOT_API_KEY");
        Orianna.setRiotAPIKey(key);
    }

    public MySummoner getAvailableChest(String summonerName, Region region) {
        MySummoner mySummoner = null;
        try {
            final Summoner summoner = Summoner.named(summonerName).withRegion(region).get();
            final ChampionMasteries cms = summoner.getChampionMasteries();
            HashSet<Champion> champions = new HashSet<>();
            for (ChampionMastery championMastery : cms) {
                if (!championMastery.isChestGranted()) {
                    champions.add(new Champion(
                            championMastery.getChampion().getName(),
                            championMastery.getChampion().getImage().getURL()
                    ));
                }
            }
            mySummoner = new MySummoner(summoner.getName(), summoner.getRegion(),
                    summoner.getProfileIcon().getImage().getURL(), summoner.getLevel(), champions);
        } catch (ForbiddenException e) {
            throw new RiotApiKeyExpiredException("The Riot API key has been expired");
        } catch (NullPointerException e) {
            throw new SummonerNotFoundException("Summoner does not exists");
        }
        return mySummoner;
    }

}