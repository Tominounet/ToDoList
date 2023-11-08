package com.neosoft.training.services;

import com.neosoft.training.model.MenuOption;

public class DisplayHandler {
    private static DisplayHandler display;

    private DisplayHandler() {

    }

    public static DisplayHandler newInstance() {
        if(display == null) {
            instantiate();
        }
        return display;
    }

    private synchronized static void instantiate() {
        if(display == null) {
            display = new DisplayHandler();
        }
    }

    public void afficherMenu() {
        System.out.println("TODOLIST - Que voulez-vous faire ?");
        for( MenuOption menuOption : MenuOption.values()) {
            System.out.println(menuOption.prettyPrint());
        }
    }

    /**
     * Pour l'action 4
     */
    public static void afficherTaskList() {

    }

    /**
     * Pour l'action 5
     */
    public void afficherTask() {

    }

    /**
     * Pour l'action 6
     */
    public void afficherUserList() {

    }
}
