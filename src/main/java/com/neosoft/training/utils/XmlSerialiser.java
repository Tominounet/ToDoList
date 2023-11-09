package com.neosoft.training.utils;

import com.neosoft.training.model.User;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.IOException;

public class XmlSerialiser {

    public static File serializeUser(User user) throws JAXBException, IOException {
        JAXBContext ctx = JAXBContext.newInstance(User.class);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        File file = FileCreator.creerFichier("test", "xml");
        marshaller.marshal(user, file);

        return file;
    }

    public static User unserializeUser(File file) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(User.class);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();

        return (User) unmarshaller.unmarshal(file);
    }
}
