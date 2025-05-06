package com.softwareprojekt.teambuilder.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Teilnehmer {

    //Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long matrnr;

    private String vorname;
    private String nachname;

    //Obligatorischer leerer Konstruktor
    public Teilnehmer(){

    }

    //Getter + Setter
    public long getMatrnr() {
        return matrnr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    //Beziehung zu der Veranstaltungstabelle (m:n)
    @ManyToMany (mappedBy = "teilnehmer")
    private List<Veranstaltung> veranstaltungen;
}
