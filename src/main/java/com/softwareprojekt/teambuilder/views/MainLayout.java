package com.softwareprojekt.teambuilder.views;

import com.softwareprojekt.teambuilder.security.SecurityService;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.popover.Popover;

import javax.swing.*;

public class MainLayout extends AppLayout {

    private final SecurityService securityService;

    public MainLayout(SecurityService securityService) {
        this.securityService = securityService;
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        H1 logo = new H1("Team Builder");
        logo.addClassNames("text-l", "m-m");

        VerticalLayout menuLayout = new VerticalLayout();
        menuLayout.setWidth("200px");
        menuLayout.setSpacing(false);

        Button logOutButton = new Button("Log out", e -> securityService.logout());
        logOutButton.addThemeVariants(ButtonVariant.LUMO_ERROR);
        logOutButton.setWidthFull();

        Button profileButton = new Button("Profil");
        profileButton.setWidthFull();

        Avatar logoAvatar = new Avatar("Team Builder"); //TODO Muss zum angemeldeten Nutzer geändert werden
        logoAvatar.getStyle().set("margin-right", "10px");

        menuLayout.add(profileButton);
        menuLayout.add(logOutButton);

        Popover menu = new Popover();
        menu.setTarget(logoAvatar);
        menu.add(menuLayout);

        HorizontalLayout header = new HorizontalLayout();

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.setWidthFull();

        header.add(logo);
        header.add(logoAvatar);

        header.expand(logo);

        addToNavbar(header);
    }

    private void createDrawer() {

    }
}
