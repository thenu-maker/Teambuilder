package com.softwareprojekt.teambuilder.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gruppe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Gruppenname;
    private String Anmerkungen;

    public Gruppe(){

    }
    public long getId() {
        return id;
    }

    public String getAnmerkungen() {
        return Anmerkungen;
    }

    public void setAnmerkungen(String anmerkungen) {
        Anmerkungen = anmerkungen;
    }

    public String getGruppenname() {
        return Gruppenname;
    }

    public void setGruppenname(String gruppenname) {
        Gruppenname = gruppenname;
    }
}
