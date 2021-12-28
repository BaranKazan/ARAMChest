package com.BaranKazan.ARAMChest.champion;

public class Champion {

    private final String name;
    private final String imageURL;

    public Champion(String name, String imageURL) {
        this.name = name;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getImageURL() {
        return imageURL;
    }
}
