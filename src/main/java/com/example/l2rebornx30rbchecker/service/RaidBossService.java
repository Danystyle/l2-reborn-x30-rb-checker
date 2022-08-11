package com.example.l2rebornx30rbchecker.service;

import com.example.l2rebornx30rbchecker.model.entity.RaidBoss;
import com.example.l2rebornx30rbchecker.model.view.RaidBossViewModel;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public interface RaidBossService {
    void seedRaidBoss(RaidBoss raidBoss);
    List<RaidBossViewModel> getAllRaidBosses();

    void updateInfo(List<RaidBoss> raidBosses) throws UnsupportedAudioFileException, LineUnavailableException, IOException;

    void updateTimeOfDeath(String name, LocalDateTime timeOfDeath);
}
