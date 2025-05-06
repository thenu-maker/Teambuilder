package com.softwareprojekt.teambuilder.entities;

import jakarta.persistence.*;

import javax.annotation.Nullable;
import java.util.List;

@Entity
public class Veranstaltung {

    //Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String titel;
    private int semester;

    //Möglichkeit zwischen zwei Bewertungseinheiten
    public enum Bewertungseinheit{
        Noten, Punkte
    }

    //Obligatorischer leerer Konstruktor
    public Veranstaltung(){

    }

    //Getter + Setter
    public long getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    //Beziehung zu der Teilnehmertabelle (m:n)
    @ManyToMany(cascade= CascadeType.PERSIST)
    private List<Teilnehmer> teilnehmer;
}
