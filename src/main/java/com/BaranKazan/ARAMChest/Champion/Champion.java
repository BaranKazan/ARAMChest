package com.BaranKazan.ARAMChest.Champion;

public class Champion {

    private int id;
    private boolean chestUnlocked;

    public Champion(int id, boolean chestUnlocked) {
        this.id = id;
        this.chestUnlocked = chestUnlocked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isChestUnlocked() {
        return chestUnlocked;
    }

    public void setChestUnlocked(boolean chestUnlocked) {
        this.chestUnlocked = chestUnlocked;
    }
}
