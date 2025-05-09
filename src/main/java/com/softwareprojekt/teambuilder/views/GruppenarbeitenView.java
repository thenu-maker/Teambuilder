package com.softwareprojekt.teambuilder.views;

import com.softwareprojekt.teambuilder.entities.Gruppenarbeit;
import com.softwareprojekt.teambuilder.repository.GruppenarbeitRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.textfield.TextField;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "gruppenarbeiten", layout = MainLayout.class)
@PageTitle("Gruppenarbeiten | TeamBuilder")
@PermitAll
public class GruppenarbeitenView extends VerticalLayout {


    private final TextField titelField = new TextField();
    private final Button addButton = new Button("+");
    private final Grid<Gruppenarbeit> grid = new Grid<>(Gruppenarbeit.class);
    private final GruppenarbeitRepository gruppenarbeitRepository;

    @Autowired
    public GruppenarbeitenView(GruppenarbeitRepository pgruppenarbeitRepository) {
        this.gruppenarbeitRepository = pgruppenarbeitRepository;


        add(new H1("Gruppenarbeiten")); // Überschrift

        Span neuLabel = new Span("Neu:");
        titelField.setPlaceholder("Titel");
        addButton.addClickListener(e -> addGruppenarbeit());
        HorizontalLayout inputLayout = new HorizontalLayout(neuLabel, titelField, addButton);
        inputLayout.setVerticalComponentAlignment(Alignment.CENTER, neuLabel, titelField, addButton);
        add(inputLayout);

        grid.setItems(gruppenarbeitRepository.findAll());
        add(grid);
    }

    private void addGruppenarbeit() {
        String titel = titelField.getValue().trim();
        if (!titel.isEmpty()) {
            Gruppenarbeit neueArbeit = new Gruppenarbeit(titel);
            gruppenarbeitRepository.save(neueArbeit);
            grid.setItems(gruppenarbeitRepository.findAll());
            titelField.clear();
        }
    }
}

