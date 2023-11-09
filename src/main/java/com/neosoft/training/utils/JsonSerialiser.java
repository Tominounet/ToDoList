package com.neosoft.training.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.neosoft.training.model.User;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonSerialiser {

    private final ObjectMapper objectMapper;

    public JsonSerialiser() {
        this.objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        objectMapper.registerModule(new JavaTimeModule());
    }

    public File serializeUser(User user) throws IOException {
        String jsonString = objectMapper.writeValueAsString(user);

        File file = FileCreator.creerFichier("test", "json");

        try (FileWriter writer = new FileWriter(file.getAbsolutePath())){
            writer.write(jsonString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return file;
    }

    public User unserializeUser(File file) throws IOException {
        return objectMapper.readValue(file, User.class);
    }
}
