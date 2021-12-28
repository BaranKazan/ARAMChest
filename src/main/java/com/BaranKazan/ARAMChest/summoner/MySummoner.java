package com.BaranKazan.ARAMChest.summoner;
import com.BaranKazan.ARAMChest.champion.Champion;
import com.merakianalytics.orianna.types.common.Region;

import java.util.HashSet;

public class MySummoner {

    private final String summonerName;
    private final Region region;
    private final String profileIconURL;
    private final int level;
    private final HashSet<Champion> champions;

    public MySummoner(String summonerName, Region region, String profileIconURL, int level, HashSet<Champion> champions) {
        this.summonerName = summonerName;
        this.region = region;
        this.profileIconURL = profileIconURL;
        this.level = level;
        this.champions = champions;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public Region getRegion() {
        return region;
    }

    public String getProfileIconURL() {
        return profileIconURL;
    }

    public int getLevel() {
        return level;
    }

    public HashSet<Champion> getChampions() {
        return champions;
    }
}
