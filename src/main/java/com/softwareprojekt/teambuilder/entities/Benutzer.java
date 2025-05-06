package com.softwareprojekt.teambuilder.entities;

import com.vaadin.flow.component.avatar.Avatar;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Benutzer {

    public enum Role {
        ADMIN,
        PROFESSOR,
        STUDENT
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String username;

    private String password;

    private Avatar avatar;

    private Role role;

    public Benutzer() {}

    public Benutzer(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Benutzer(String username, String password, Role role,Avatar avatar) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
