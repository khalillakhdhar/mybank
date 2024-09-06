package com.banque.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.banque.model.dto.CompteDto;
import com.banque.model.dto.ProfileDto;
import com.banque.model.dto.UtilisateurDto;

public interface UtilisateurService {
public UtilisateurDto addOneUtilisateur(UtilisateurDto utilisateurDto);
public Page<UtilisateurDto> getAllUtilisateur(Pageable pageable);
public void deleteOneUtilisateur(long id);
public ProfileDto assignProfilToUtilisateur(long idUser,ProfileDto profileDto);
public UtilisateurDto getOneUtilisateur(long id);
public UtilisateurDto assignCompteToUtilisateur(long idUser,CompteDto compteDto);

}
