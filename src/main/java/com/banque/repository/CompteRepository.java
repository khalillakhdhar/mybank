package com.banque.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.banque.model.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
