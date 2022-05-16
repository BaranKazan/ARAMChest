package com.BaranKazan.ARAMChest.summoner;

import com.BaranKazan.ARAMChest.exception.MyFileNotFoundException;
import com.merakianalytics.orianna.types.common.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@RestController
public class SummonerController {
    private final SummonerService summonerService;

    @Autowired
    public SummonerController(SummonerService summonerService) {
        this.summonerService = summonerService;
    }

    @RequestMapping(path = "/")
    public ModelAndView welcome() {
        File file;
        String filePath = "index.html";
        try {
            file = ResourceUtils.getFile(filePath);
        } catch (FileNotFoundException e) {
            throw new MyFileNotFoundException(filePath+ "could not be found", e);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(file.getPath());
        return modelAndView;
    }

    @RequestMapping(path = "/riot.txt")
    public ResponseEntity<InputStreamResource> riotTxt() {
        File file;
        InputStreamResource inputStreamResource;
        String filePath = "riot.txt";
        try {
            file = ResourceUtils.getFile(filePath);
            inputStreamResource = new InputStreamResource(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            throw new MyFileNotFoundException(filePath+" could not be found", e);
        }
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=riot.txt")
                .contentType(MediaType.TEXT_PLAIN)
                .contentLength(file.length())
                .body(inputStreamResource);
    }

    @GetMapping(path = "/summonerName/{summonerName}/region/{region}")
    public MySummoner getAvailableChampionChest(
            @PathVariable("summonerName") String summonerName,
            @PathVariable("region") Region region) {
        return summonerService.getAvailableChest(summonerName, region);
    }
}
