package com.softwareprojekt.teambuilder.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Veranstaltung {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String titel;
    private int semester;

    public Veranstaltung(){

    }

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

    @ManyToMany(cascade= CascadeType.PERSIST)
    private List<Teilnehmer> teilnehmer;
}
