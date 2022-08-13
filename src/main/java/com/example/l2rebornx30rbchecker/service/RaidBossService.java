package com.example.l2rebornx30rbchecker.service;

import com.example.l2rebornx30rbchecker.model.entity.RaidBoss;
import com.example.l2rebornx30rbchecker.model.view.RaidBossViewModel;

import java.time.LocalDateTime;
import java.util.List;

public interface RaidBossService {
    void seedRaidBoss(RaidBoss raidBoss);
    List<RaidBossViewModel> getAllRaidBosses();

    void updateInfo();

    void updateTimeOfDeath(String name, LocalDateTime timeOfDeath);
}
