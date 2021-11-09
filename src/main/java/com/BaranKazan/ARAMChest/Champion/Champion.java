package com.BaranKazan.ARAMChest.Champion;

public class Champion {

    private final int id;
    private final String name;
    private final boolean chestUnlocked;

    public Champion(int id, String name, boolean chestUnlocked) {
        this.id = id;
        this.name = name;
        this.chestUnlocked = chestUnlocked;
    }

    public int getId() {

        return id;
    }

    public String getName(){
        return name;
    }

    public boolean isChestUnlocked() {
        return chestUnlocked;
    }
}
