package com.softwareprojekt.teambuilder.entities;
import jakarta.persistence.*;

import java.util.*;

@Entity
public class Gruppe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Gruppenname;
    private String Anmerkungen;

    @ManyToOne
    @JoinColumn(name = "gruppenarbeit_id")
    private Gruppenarbeit gruppenarbeit;

    @OneToMany(mappedBy = "gruppe", cascade = CascadeType.ALL)
    private List<Teilnahme> teilnahmen;

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


    public Gruppenarbeit getGruppenarbeit() {
        return gruppenarbeit;
    }

    public void setGruppenarbeit(Gruppenarbeit gruppenarbeit) {
        this.gruppenarbeit = gruppenarbeit;
    }

}
