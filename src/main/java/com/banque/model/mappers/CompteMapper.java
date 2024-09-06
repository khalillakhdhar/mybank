package com.banque.model.mappers;

import org.modelmapper.ModelMapper;

import com.banque.model.dto.CompteDto;
import com.banque.model.entities.Compte;



public class CompteMapper {
	private static final ModelMapper modelMapper= new ModelMapper();
	public static CompteDto convertToDTO(Compte compte)
	{
	return modelMapper.map(compte, CompteDto.class);
	}

	public static Compte convertToEntity(CompteDto compteDTO)
	{
	return modelMapper.map(compteDTO, Compte.class);	
	}
}
