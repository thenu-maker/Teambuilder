package com.softwareprojekt.teambuilder.repository;

import com.softwareprojekt.teambuilder.entities.Benutzer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenutzerRepository extends JpaRepository<Benutzer, Long> {

    Benutzer findByUsername(String username);
}
