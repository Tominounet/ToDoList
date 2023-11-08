package com.neosoft.training;

import com.neosoft.training.services.DisplayHandler;
import com.neosoft.training.services.SaisieHandler;
import com.neosoft.training.utils.Input;
import com.neosoft.training.model.MenuOption;
import com.neosoft.training.services.RepositoryHandler;

import java.util.Scanner;

public class Main {
    private static DisplayHandler display = DisplayHandler.newInstance();
    private static RepositoryHandler repository = new RepositoryHandler();
    private static SaisieHandler saisie = new SaisieHandler();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputMenu = -1;
        while (inputMenu != MenuOption.EXIT.getId()) {
            try {
                display.afficherMenu();
                inputMenu = Input.inputInt(scanner, inputMenu);
                MenuOption.find(inputMenu);
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
        System.out.println("Au revoir");
    }
}