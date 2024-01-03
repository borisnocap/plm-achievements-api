package ru.plm.achievements;

import org.bukkit.entity.Player;

public interface AchievementsAPI {

    void activateTrigger(Player player, AchievementTrigger trigger, long triggerAmount);
}
