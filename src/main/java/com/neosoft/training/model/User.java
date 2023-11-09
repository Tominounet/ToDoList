package com.neosoft.training.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import org.apache.commons.lang3.RandomStringUtils;

import java.lang.annotation.Annotation;
import java.time.LocalDate;

@XmlRootElement
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @XmlAttribute
    @JsonProperty
    private final String id = RandomStringUtils.randomNumeric(10);
    @XmlTransient
    @JsonIgnore
    private final String password = RandomStringUtils.randomNumeric(20);
    @XmlElement
    @JsonProperty
    private final String nom;
    @XmlElement
    @JsonProperty
    private final String prenom;
    @XmlElement
    @JsonProperty
    private final String mail;

    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private final LocalDate dateCreation;

    @JsonCreator
    public User() {
        this.nom = "";
        this.prenom = "";
        this.mail = "";
        this.dateCreation = LocalDate.now();
    }

    public User(String nom, String prenom, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.dateCreation = LocalDate.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", dateCreation='" + dateCreation + '\'' +
                '}';
    }
//
//    static class LocalDateJsonResolver implements JsonTypeResolver {
//
//        @Override
//        public Class<? extends TypeResolverBuilder<?>> value() {
//            return null;
//        }
//
//        @Override
//        public Class<? extends Annotation> annotationType() {
//            return LocalDate.class;
//        }
//    }
}
