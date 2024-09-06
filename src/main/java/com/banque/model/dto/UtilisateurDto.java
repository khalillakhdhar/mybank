package com.banque.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurDto extends BaseDto {

	@NotBlank
	private String nom;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	@Size(max = 6)
	private String password;
	@JsonIgnoreProperties("utilisateur")
	private List<CompteDto> comptes;
	@JsonIgnoreProperties("utilisateur")
	private ProfileDto profileDto;
	
}
