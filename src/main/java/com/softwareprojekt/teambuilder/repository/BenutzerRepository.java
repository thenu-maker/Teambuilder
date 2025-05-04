package com.softwareprojekt.teambuilder.repository;

import com.softwareprojekt.teambuilder.entities.Benutzer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenutzerRepository extends JpaRepository<Benutzer, Long> {
}
