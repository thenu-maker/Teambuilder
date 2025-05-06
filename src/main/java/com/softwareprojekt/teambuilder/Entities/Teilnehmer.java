package com.softwareprojekt.teambuilder.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Teilnehmer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long matrnr;

    private String vorname;
    private String nachname;

    public Teilnehmer(){

    }

    public long getMatrnr() {
        return matrnr;
    }

    public void setMatrnr(long matrnr) {
        this.matrnr = matrnr;
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

    @ManyToMany
    private List<Veranstaltung> veranstaltungen;

    @ManyToMany
    private List<Gruppe> gruppen;
}
