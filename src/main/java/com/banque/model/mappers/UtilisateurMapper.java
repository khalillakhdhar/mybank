package com.banque.model.mappers;

import org.modelmapper.ModelMapper;

import com.banque.model.dto.UtilisateurDto;
import com.banque.model.entities.Utilisateur;



public class UtilisateurMapper {
	private static final ModelMapper modelMapper= new ModelMapper();
	public static UtilisateurDto convertToDTO(Utilisateur utilisateur)
	{
	return modelMapper.map(utilisateur, UtilisateurDto.class);
	}

	public static Utilisateur convertToEntity(UtilisateurDto utilisateurDTO)
	{
	return modelMapper.map(utilisateurDTO, Utilisateur.class);	
	}

}