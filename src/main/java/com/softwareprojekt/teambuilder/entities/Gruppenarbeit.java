package com.softwareprojekt.teambuilder.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Gruppenarbeit {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String titel;

    @OneToMany(mappedBy = "gruppenarbeit", cascade = CascadeType.ALL)
    private List<Gruppe> gruppen;

    public Gruppenarbeit() {

    }
    public Gruppenarbeit(String titel) {
        this.titel = titel;
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

}
