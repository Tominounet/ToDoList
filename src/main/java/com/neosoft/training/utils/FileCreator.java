package com.neosoft.training.utils;

import java.io.File;
import java.io.IOException;

public class FileCreator {

    private static final String directory = "C:/Users/t.richard/Downloads/";

    public static File creerFichier(String fileName, String fileExtension) throws IOException {
        File nouveauFichier = new File(directory + fileName + "." + fileExtension);
        if (nouveauFichier.delete()) {
            System.out.println("Le Fichier existe déjà. Il a été supprimé.");
        }
        if (nouveauFichier.createNewFile()) {
            System.out.println("Fichier créé avec succès : " + nouveauFichier.getName());
        }

        return nouveauFichier;
    }

}
