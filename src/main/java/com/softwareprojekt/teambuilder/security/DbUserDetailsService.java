package com.softwareprojekt.teambuilder.security;

import com.softwareprojekt.teambuilder.entities.Benutzer;
import com.softwareprojekt.teambuilder.services.BenutzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DbUserDetailsService implements UserDetailsService {

    @Autowired
    private BenutzerService benutzerService;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Benutzer benutzer = benutzerService.findBenutzerByUsername(username);
        if (benutzer == null) {
            throw new UsernameNotFoundException(username);
        }
        return new DbUserPrincipal(benutzer);
    }
}
