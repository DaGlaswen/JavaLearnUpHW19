package ru.learnup.march;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        RandomNumberGame randomNumberGame = context.getBean(RandomNumberGame.class);
        randomNumberGame.startTheGame();
    }
}
