package ru.plm.achievements;

public interface AchievementsAPI {

    void activateTrigger(AchievementTrigger trigger, long triggerAmount);

    void activateTrigger(AchievementTrigger trigger, double triggerAmount);
}
