package com.BaranKazan.ARAMChest.helper;

import com.BaranKazan.ARAMChest.exception.MyFileNotFoundException;

import java.io.File;
import java.net.URL;

public final class Helper {

    private static Helper instance;

    private Helper(){}

    public static Helper getInstance(){
        if(instance == null){
                instance = new Helper();
        }
        return instance;
    }

    public File getResourceFile(String fileName){
        URL url = this.getClass()
                .getClassLoader()
                .getResource(fileName);

        if(url == null) {
            throw new MyFileNotFoundException(fileName + " does not exist");
        }
        return new File(url.getFile());
    }
}
