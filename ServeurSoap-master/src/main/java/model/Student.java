package model;

import enums.Genre;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
@XmlRootElement
public class Student {
    @XmlTransient
    public int id;
    @XmlTransient
    public  String nom ;
    @XmlTransient
    public String prenom ;
    @XmlTransient
     public Genre genre ;

    public Student(int id, String nom, String prenom, Genre genre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
    }
    public Student() {
        // Default constructor required by JAXB
    }


    public int getId() {
        return id;
    }
    @XmlElement(name = "nom")
    public String getNom() {
        return nom;
    }
    @XmlElement(name = "prenom")
    public String getPrenom() {
        return prenom;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
