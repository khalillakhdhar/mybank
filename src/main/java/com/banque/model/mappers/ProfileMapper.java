package com.banque.model.mappers;

import org.modelmapper.ModelMapper;

import com.banque.model.dto.ProfileDto;
import com.banque.model.entities.Profile;

public class ProfileMapper {
	private static final ModelMapper modelMapper= new ModelMapper();
	public static ProfileDto convertToDTO(Profile profile)
	{
	return modelMapper.map(profile, ProfileDto.class);
	}

	public static Profile convertToEntity(ProfileDto profileDTO)
	{
	return modelMapper.map(profileDTO, Profile.class);	
	}
}
