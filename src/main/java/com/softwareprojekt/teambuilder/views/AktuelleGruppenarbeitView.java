package com.softwareprojekt.teambuilder.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "aktuellegruppenarbeit", layout = MainLayout.class)
@PageTitle("AktuelleGruppenarbeit | TeamBuilder")
@PermitAll
public class AktuelleGruppenarbeitView extends VerticalLayout {

    public AktuelleGruppenarbeitView() {


        add(new H1("AktuelleGruppenarbeit")); // Überschrift
    }
}

