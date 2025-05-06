package com.softwareprojekt.teambuilder.security;

import com.softwareprojekt.teambuilder.entities.Benutzer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class DbUserPrincipal implements UserDetails {

    private final Benutzer benutzer;

    public DbUserPrincipal(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return benutzer.getPassword();
    }

    @Override
    public String getUsername() {
        return benutzer.getUsername();
    }
}
