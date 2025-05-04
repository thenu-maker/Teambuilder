package com.softwareprojekt.teambuilder.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gruppenarbeit {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    private String titel;

    public Gruppenarbeit() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

}
