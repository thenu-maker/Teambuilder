package com.softwareprojekt.teambuilder.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "/", layout = MainLayout.class)
@PageTitle("Dashboard | TeamBuilder")
@PermitAll
public class DashboardView extends VerticalLayout {

    public DashboardView() {
        add(new H1("Dashboard"));
    }
}
