package com.example.l2rebornx30rbchecker.repository;

import com.example.l2rebornx30rbchecker.model.entity.RaidBoss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaidBossRepository extends JpaRepository<RaidBoss, Long> {
    List<RaidBoss> findAllByOrderByAliveRespawnEnd();
}
