package com.banque.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class ProfileDto {
	@Size(min = 8)
	private String telephone;
	private String adresse;
	@JsonIgnoreProperties("profile")
	private UtilisateurDto utilisateur;
}