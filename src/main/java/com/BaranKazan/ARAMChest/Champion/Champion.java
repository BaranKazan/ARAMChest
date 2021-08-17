package com.BaranKazan.ARAMChest.Champion;

public class Champion {

    private float id;
    private boolean chestUnlocked;

    public Champion() {
    }

    public Champion(float id) {
        this.id = id;
    }

    public Champion(float id, boolean chestUnlocked){
        this.id = id;
        this.chestUnlocked = chestUnlocked;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public boolean isChestUnlocked() {
        return chestUnlocked;
    }

    public void setChestUnlocked(boolean chestUnlocked) {
        this.chestUnlocked = chestUnlocked;
    }
}
