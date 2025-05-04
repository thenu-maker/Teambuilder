package com.softwareprojekt.teambuilder.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class Termin {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    private Date datum;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Gruppenarbeit> gruppenarbeiten = new ArrayList<Gruppenarbeit>();

    public Termin() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public List<Gruppenarbeit> getGruppenarbeiten() {
        return gruppenarbeiten;
    }

    public void setGruppenarbeiten(List<Gruppenarbeit> gruppenarbeiten) {
        this.gruppenarbeiten = gruppenarbeiten;
    }
}
