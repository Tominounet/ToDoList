package com.neosoft.training.model;

public enum Priority {
    UNDEFINED(-1, "NON DÉFINI"),
    URGENT(1, "URGENT"),
    HIGH(2, "ÉLEVÉ"),
    MIDDLE(3, "MOYEN"),
    LOW(4, "FAIBLE");

    private final int level;
    private final String libelle;

    Priority(int level, String libelle) {
        this.level = level;
        this.libelle = libelle;
    }

    public static String prettyPrintAll() {
        return UNDEFINED.prettyPrint() + ";" +
                URGENT.prettyPrint() + ";" +
                HIGH.prettyPrint() + ";" +
                MIDDLE.prettyPrint() + ";" +
                LOW.prettyPrint();
    }

    @Override
    public String toString() {
        return "Priority{" +
                "level=" + level +
                ", libelle='" + libelle + '\'' +
                '}';
    }

    public String prettyPrint() {
        return "[Niveau : " + level + ", Libellé : '" + libelle + ']';
    }
}
