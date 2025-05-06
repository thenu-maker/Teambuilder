package com.softwareprojekt.teambuilder.services;

import com.softwareprojekt.teambuilder.entities.Benutzer;
import com.softwareprojekt.teambuilder.repository.BenutzerRepository;
import com.vaadin.flow.component.avatar.Avatar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BenutzerService {

    @Autowired
    private BenutzerRepository benutzerRepository;

    public Benutzer createBenutzer(String username, String password) {
        Avatar avatar = new Avatar(username);
        Benutzer benutzer = new Benutzer(username, password, Benutzer.Role.PROFESSOR);
        return benutzer;
    }

    public Benutzer createBenutzer(String username, String password, Benutzer.Role role) {
        Avatar avatar = new Avatar(username);
        Benutzer benutzer = new Benutzer(username,password,role,avatar);
        return benutzer;
    }

    public Benutzer createBenutzer(String username, String password, Benutzer.Role role, String imgAvatar) {
        Avatar avatar = new Avatar(username, imgAvatar);
        Benutzer benutzer = new Benutzer(username,password,role,avatar);
        return benutzer;
    }

    public Benutzer createBenutzer(String username, String password, Benutzer.Role role, Avatar avatar) {
        Benutzer benutzer = new Benutzer(username,password,role, avatar);
        return benutzer;
    }

    public Benutzer findBenutzerByUsername(String username) {
        return benutzerRepository.findByUsername(username);
    }
}
