package com.BaranKazan.ARAMChest.Helper;

public class InputControl {

    public static boolean checkSummonerName(String name){
        if(name != null && !(name.trim().length() < 3))
            return true;
        else
            throw new IllegalStateException("The name cannot be empty or have less than 3 characters");
    }
}
