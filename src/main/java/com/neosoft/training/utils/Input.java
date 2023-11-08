package com.neosoft.training.utils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
    public static String inputString(Scanner input) {
        String saisie = "";

        while ("".equals(saisie)) {
            try {
                saisie = input.next();
            } catch (InputMismatchException e) {
                System.out.println("Vous n'avez pas saisi une chaine de caractère valide - Veuillez réessayer");
            } catch (NoSuchElementException e) {
                System.out.println("Chaine trop grande - Veuillez réessayer");
            } finally {
                input.nextLine();
            }
        }

        return saisie;
    }

    public static int inputInt(Scanner input, int falldown) {
        int saisie = falldown;

        while (saisie == falldown) {
            try {
                saisie = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Vous n'avez pas saisi un nombre entier valide - Veuillez réessayer");
            } catch (NoSuchElementException e) {
                System.out.println("Entier trop grand - Veuillez réessayer");
            } finally {
                input.nextLine();
            }
        }

        return saisie;
    }

    public static float inputFloat(Scanner input) {
        float saisie = 0;

        while (saisie == 0) {
            try {
                saisie = input.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Vous n'avez pas saisi un nombre à virgule - Veuillez réessayer");
            } catch (NoSuchElementException e) {
                System.out.println("Entier trop grand - Veuillez réessayer");
            } finally {
                input.nextLine();
            }
        }

        return saisie;
    }


    public static boolean inputBoolean(Scanner input) {
        Boolean saisie = null;

        while (saisie == null) {
            try {
                saisie = input.nextBoolean();
            } catch (InputMismatchException e) {
                System.out.println("Vous n'avez pas saisi un booléen ('true' ou 'false') - Veuillez réessayer");
            } catch (NoSuchElementException e) {
                System.out.println("Saisie trop grande - Veuillez réessayer");
            } finally {
                input.nextLine();
            }
        }

        return saisie.booleanValue();
    }
}
