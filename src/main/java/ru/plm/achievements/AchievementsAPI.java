package ru.plm.achievements;

public interface AchievementsAPI {

    void activateTrigger(String playerName, AchievementTrigger trigger, long triggerAmount);
}
