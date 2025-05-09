package com.softwareprojekt.teambuilder.entities;

import jakarta.persistence.*;

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

    public Teilnehmer(String vorname, String nachname){
        this.vorname= vorname;
        this.nachname= nachname;
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

    @OneToMany(mappedBy = "teilnehmer", cascade = CascadeType.ALL)
    private List<Teilnahme> teilnahmen;


}
