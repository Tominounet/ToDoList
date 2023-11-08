package com.neosoft.training.strategy;

import java.util.function.Function;

public enum DurationStrategy {
    SIMPLE_TASK("SIMPLE_TASK", x -> x * 2 + 1),
    MEDIUM_TASK("MEDIUM_TASK", x -> x * 3 + 3),
    COMPLEX_TASK("COMPLEX_TASK",  x -> x * 4 + 6),
    DEFINED_TASK("DEFINED_TASK",  x -> x);

    private final String libelle;
    private final Function<Integer, Integer> calcul;

    DurationStrategy(String libelle, Function<Integer, Integer> calcul) {
        this.libelle = libelle;
        this.calcul = calcul;
    }

    public String getLibelle() {
        return libelle;
    }

    public Function<Integer, Integer> getCalcul() {
        return calcul;
    }

    @Override
    public String toString() {
        return "DurationStrategy{" +
                "libelle='" + libelle + '\'' +
                ", calcul=" + calcul +
                '}';
    }
}
