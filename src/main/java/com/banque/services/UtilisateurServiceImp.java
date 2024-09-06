package com.banque.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.banque.model.dto.CompteDto;
import com.banque.model.dto.ProfileDto;
import com.banque.model.dto.UtilisateurDto;
import com.banque.model.entities.Compte;
import com.banque.model.entities.Utilisateur;
import com.banque.model.mappers.CompteMapper;
import com.banque.model.mappers.ProfileMapper;
import com.banque.model.mappers.UtilisateurMapper;
import com.banque.repository.CompteRepository;
import com.banque.repository.UtilisateurRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UtilisateurServiceImp implements UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;
	private final CompteRepository compteRepository;

	@Override
	public UtilisateurDto addOneUtilisateur(UtilisateurDto utilisateurDto) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = UtilisateurMapper.convertToEntity(utilisateurDto);
		Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);
		return UtilisateurMapper.convertToDTO(savedUtilisateur);
	}

	@Override
	public Page<UtilisateurDto> getAllUtilisateur(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<Utilisateur> utilisateurs = utilisateurRepository.findAll(pageable);
		return utilisateurs.map(UtilisateurMapper::convertToDTO);
	}

	@Override
	public void deleteOneUtilisateur(long id) {
		// TODO Auto-generated method stub
		utilisateurRepository.deleteById(id);

	}

	@Override
	public ProfileDto assignProfilToUtilisateur(long idUser, ProfileDto profileDto) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = utilisateurRepository.findById(idUser)
				.orElseThrow(() -> new EntityNotFoundException("Utilisateur introuvable avec l'id " + idUser));
		utilisateur.setProfile(ProfileMapper.convertToEntity(profileDto));
		Utilisateur updatedUser = utilisateurRepository.save(utilisateur);
		return profileDto;
	}

	@Override
	public UtilisateurDto getOneUtilisateur(long id) {
		// TODO Auto-generated method stub
		return UtilisateurMapper.convertToDTO(utilisateurRepository.findById(id).get());
	}

	@Override
	public UtilisateurDto assignCompteToUtilisateur(long idUser, CompteDto compteDto) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = utilisateurRepository.findById(idUser)
				.orElseThrow(() -> new EntityNotFoundException("Utilisateur introuvable avec l'id " + idUser));
		
		utilisateur.getComptes().add(CompteMapper.convertToEntity(compteDto));
		Utilisateur savedUtilisateur=utilisateurRepository.save(utilisateur);
		return UtilisateurMapper.convertToDTO(savedUtilisateur);
	}

}
