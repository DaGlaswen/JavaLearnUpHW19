package ru.learnup.march;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
public class RandomNumberListener implements ApplicationListener<RandomNumberEvent> {

    private RandomNumberGame randomNumberGame;

    public RandomNumberListener(RandomNumberGame randomNumberGame) {
        this.randomNumberGame = randomNumberGame;
    }

    @Override
    public void onApplicationEvent(RandomNumberEvent event) {
        log.info("Event {timestamp: {}, data {}", event.getTimestamp(), event.getGuess());
        randomNumberGame.guess(event.getGuess());
    }
}

//@Slf4j
//public class RandomNumberListener implements ApplicationListener<RandomNumberEvent> {
//
//    private boolean isGuessed = false;
//    private int randomInt;
//    private Locale locale;
//    public void setRandomInt() {
//        this.randomInt = (int) Math.random() * 1000;
//    }
//    public boolean getIsGuessed() {
//        return isGuessed;
//    }
//    @Override
//    public void onApplicationEvent(RandomNumberEvent event) {
//        int numGuessed = event.getGuess();
//        log.info("Event (timestamp: {}, randomNum: {})", event.getTimestamp(), numGuessed);
//    }
//
//    public static Logger getLog() {
//        return log;
//    }
//}
