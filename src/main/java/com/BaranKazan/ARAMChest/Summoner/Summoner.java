package com.BaranKazan.ARAMChest.Summoner;

import com.BaranKazan.ARAMChest.Enum.Region;

public class Summoner {

    private String summonerId;
    private String name;
    private Region region;
    //Summoner Icon?

    public Summoner(String name, Region region) {
        this.name = name;
        this.region = region;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
