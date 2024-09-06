package com.banque.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Min;
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
public class CompteDto extends BaseDto {
	@Min(value = 0)
	private double solde;
	@JsonIgnoreProperties("comptes")
	private UtilisateurDto utilisateur;
	@JsonIgnoreProperties({"source","destination"})
	private List<TransactionDto> transactions;

}
