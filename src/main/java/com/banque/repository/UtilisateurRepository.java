package com.banque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banque.model.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
