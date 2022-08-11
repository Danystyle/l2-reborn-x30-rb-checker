package com.example.l2rebornx30rbchecker.web;

import com.example.l2rebornx30rbchecker.init.AppInit;
import com.example.l2rebornx30rbchecker.service.RaidBossService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    private final RaidBossService raidBossService;

    public HomeController(RaidBossService raidBossService) {
        this.raidBossService = raidBossService;
    }

    @GetMapping
    public String index(Model model) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        AppInit.update();
        LocalDateTime now = LocalDateTime.now();
        model.addAttribute("allBosses", raidBossService.getAllRaidBosses());
        model.addAttribute("now", now);
        return "index";
    }

    @GetMapping(value = "/add", params = {"bossName", "tod"})
    public String addToD(@RequestParam String bossName, @RequestParam String tod) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        LocalDateTime timeOfDeath = LocalDateTime.parse(tod, dateTimeFormatter);
        raidBossService.updateTimeOfDeath(bossName, timeOfDeath);
        return "redirect:/";
    }
}