package com.neosoft.training;
import com.neosoft.training.model.User;
import com.neosoft.training.services.DisplayHandler;
import com.neosoft.training.services.SaisieHandler;
import com.neosoft.training.utils.Input;
import com.neosoft.training.model.MenuOption;
import com.neosoft.training.services.RepositoryHandler;
import com.neosoft.training.utils.XmlSerialiser;
import jakarta.xml.bind.JAXBException;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.RandomStringGenerator;
import org.apache.commons.text.StringSubstitutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static DisplayHandler display = DisplayHandler.newInstance();
    private static RepositoryHandler repository = new RepositoryHandler();
    private static SaisieHandler saisie = new SaisieHandler();
    private final static Logger log = LoggerFactory.getLogger(Main.class);

//    public static void main(String[] args) {
//        log.info("Début du programme.");
//        Scanner scanner = new Scanner(System.in);
//        int inputMenu = -1;
//        while (inputMenu != MenuOption.EXIT.getId()) {
//            try {
//                display.afficherMenu();
//                inputMenu = Input.inputInt(scanner, inputMenu);
//                MenuOption selectedOption = MenuOption.find(inputMenu);
//            } catch (IllegalArgumentException e) {
//                log.error("Erreur : {}", e.getMessage(), e);
//            }
//        }
//        System.out.println("Au revoir");
//        log.info("Fin du programme.");
//    }


    public static void main(String[] args) throws JAXBException, IOException {
        log.info("Début du programme.");
        User user = SaisieHandler.createUtilisateur();

        File file = XmlSerialiser.serializeUser(user);

        User userFromFile = XmlSerialiser.unserializeUser(file);
        log.info("User récupéré du XML : {}", userFromFile);
        log.info("Fin du programme.");
    }
}