package com.neosoft.training.services;

import com.neosoft.training.utils.Input;
import com.neosoft.training.model.User;

import java.util.Scanner;

public class SaisieHandler {


    /**
     Création d'une tâche
     */
//    public Task createTask(User user) {
//        Scanner input = new Scanner(System.in);
//
//        // Création de la tâche
//        System.out.print("Veuillez saisir le nom de la tâche : ");
//        String title = Input.inputString(input);
//        System.out.print("Veuillez saisir la description de la tâche : ");
//        String description = Input.inputString(input);
//        System.out.print("Quelle est le niveau de priorité de celle-ci ? " + Priority.prettyPrintAll());
//        int priority = Input.inputInt(input);
//
//        return new Task()
//    }

    /**
     Création d'un utilisateur
     */
    public static User createUtilisateur() {
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez saisir votre nom : ");
        String nom = Input.inputString(input);
        System.out.print("Veuillez saisir votre prénom : ");
        String prenom = Input.inputString(input);
        System.out.print("Veuillez saisir votre mail : ");
        String mail = Input.inputString(input);

        return new User(nom, prenom, mail);
    }
}
