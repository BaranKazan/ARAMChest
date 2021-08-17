package com.BaranKazan.ARAMChest.Champion;

public class Champion {

    private long id;
    private boolean chestUnlocked;

    public Champion() {
    }

    public Champion(long id) {
        this.id = id;
    }

    public Champion(long id, boolean chestUnlocked){
        this.id = id;
        this.chestUnlocked = chestUnlocked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isChestUnlocked() {
        return chestUnlocked;
    }

    public void setChestUnlocked(boolean chestUnlocked) {
        this.chestUnlocked = chestUnlocked;
    }
}
