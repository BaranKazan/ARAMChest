package com.BaranKazan.ARAMChest.Champion;

public class Champion {

    private final int id;
    private final boolean chestUnlocked;

    public Champion(int id, boolean chestUnlocked) {
        this.id = id;
        this.chestUnlocked = chestUnlocked;
    }

    public int getId() {

        return id;
    }

    public boolean isChestUnlocked() {
        return chestUnlocked;
    }
}
