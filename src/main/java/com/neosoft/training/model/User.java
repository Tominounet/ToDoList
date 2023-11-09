package com.neosoft.training.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.RandomStringUtils;

@XmlRootElement
public class User {
    @XmlAttribute
    private final String id = RandomStringUtils.randomNumeric(10);
    @XmlElement
    private final String nom;
    @XmlElement
    private final String prenom;
    @XmlElement
    private final String mail;

    public User() {
        this.nom = "";
        this.prenom = "";
        this.mail = "";
    }

    public User(String nom, String prenom, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
