package com.softwareprojekt.teambuilder.entities;

import jakarta.persistence.*;

@Entity
public class Teilnahme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; //unsicher

    private double Leistungspunkte;
    private double Praesentationspunkte;

    @ManyToOne
    @JoinColumn(name = "gruppe_id")
    private Gruppe gruppe;

    @ManyToOne
    @JoinColumn(name = "teilnehmer_id")
    private Teilnehmer teilnehmer;

    public long getId() {
        return id;
    }

    public double getPraesentationspunkte() {
        return Praesentationspunkte;
    }

    public void setPraesentationspunkte(double praesentationspunkte) {
        Praesentationspunkte = praesentationspunkte;
    }

    public double getLeistungspunkte() {
        return Leistungspunkte;
    }

    public void setLeistungspunkte(double leistungspunkte) {
        Leistungspunkte = leistungspunkte;
    }

    public Gruppe getGruppe() {
        return gruppe;
    }

    public void setGruppe(Gruppe gruppe) {
        this.gruppe = gruppe;
    }

    public Teilnehmer getTeilnehmer() {
        return teilnehmer;
    }

    public void setTeilnehmer(Teilnehmer teilnehmer) {
        this.teilnehmer = teilnehmer;
    }

}
