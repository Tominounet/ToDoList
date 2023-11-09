package com.neosoft.training;
import com.neosoft.training.services.DisplayHandler;
import com.neosoft.training.services.SaisieHandler;
import com.neosoft.training.utils.Input;
import com.neosoft.training.model.MenuOption;
import com.neosoft.training.services.RepositoryHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;

import java.util.Scanner;

public class Main {
    private static DisplayHandler display = DisplayHandler.newInstance();
    private static RepositoryHandler repository = new RepositoryHandler();
    private static SaisieHandler saisie = new SaisieHandler();
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Début du programme.");
        Scanner scanner = new Scanner(System.in);
        int inputMenu = -1;
        while (inputMenu != MenuOption.EXIT.getId()) {
            try {
                display.afficherMenu();
                inputMenu = Input.inputInt(scanner, inputMenu);
                MenuOption.find(inputMenu);
            } catch (IllegalArgumentException e) {
                log.error("Erreur : " + e.getMessage());
            }
        }
        System.out.println("Au revoir");
        log.info("Fin du programme.");
    }
}