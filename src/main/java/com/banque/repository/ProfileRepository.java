package com.banque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banque.model.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
