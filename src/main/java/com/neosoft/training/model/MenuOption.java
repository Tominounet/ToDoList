package com.neosoft.training.model;

public enum MenuOption {
    ADD_TASK(1, "Ajouter une tâche"),
    DELETE_TASK(2, "Supprimer une tâche"),
    EDIT_TASK(3, "Modifier une tâche"),
    DISPLAY_TASK_LIST(4, "Afficher la liste des tâches"),
    DISPLAY_TASK(5, "Afficher une tâche"),
    DISPLAY_USER_LIST(6, "Afficher la liste des utilisateurs"),
    EXIT(0, "Quitter");

    private final int id;
    private final String libelle;

    MenuOption(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public String prettyPrint() {
        return this.id + " - " + this.libelle;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     *
     * @param id
     * @return MenuOption
     *
     * @throws IllegalArgumentException
     */
    public static MenuOption find(int id) {
        for (MenuOption menuOption : values()) {
            if (menuOption.getId() == id) {
                return menuOption;
            }
        }

        throw new IllegalArgumentException("Cette option n'existe pas.");
    }
}
