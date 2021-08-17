package com.BaranKazan.ARAMChest.Summoner;

import com.BaranKazan.ARAMChest.Champion.Champion;
import com.BaranKazan.ARAMChest.Enum.Region;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SummonerService {

    public List<Champion> getAvailableChampionChest(Summoner summoner){
        List<Champion> availableChampion = new ArrayList<Champion>();
        availableChampion.add(new Champion(4444, false));
        return availableChampion;
    }

    public Summoner getSummoner(String summonerName, Region region){
        return new Summoner();
    }
}
