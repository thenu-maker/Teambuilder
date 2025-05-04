package com.softwareprojekt.teambuilder.views;

import com.softwareprojekt.teambuilder.security.SecurityService;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import javax.swing.*;

public class MainLayout extends AppLayout {

    private SecurityService securityService;

    public MainLayout(SecurityService securityService) {
        this.securityService = securityService;
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        H1 logo = new H1("Team Builder");
        logo.addClassNames("text-l", "m-m");

        Button logOutButton = new Button("Log out", e -> securityService.logout());
        logOutButton.addThemeVariants(ButtonVariant.LUMO_ERROR);
        logOutButton.getStyle().set("margin-right", "10px");


        HorizontalLayout header = new HorizontalLayout();

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.setWidthFull();

        header.add(logo);
        header.add(logOutButton);

        header.expand(logo);

        addToNavbar(header);
    }

    private void createDrawer() {

    }
}
