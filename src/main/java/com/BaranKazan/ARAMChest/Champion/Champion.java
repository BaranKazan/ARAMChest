package com.BaranKazan.ARAMChest.Champion;

public class Champion {

    private int id;
    private String name;
    private String urlImage;
    private boolean chestUnlocked;

    public Champion(int id, String name, String urlImage, boolean chestUnlocked) {
        this.id = id;
        this.name = name;
        this.urlImage = urlImage;
        this.chestUnlocked = chestUnlocked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public boolean isChestUnlocked() {
        return chestUnlocked;
    }

    public void setChestUnlocked(boolean chestUnlocked) {
        this.chestUnlocked = chestUnlocked;
    }
}
