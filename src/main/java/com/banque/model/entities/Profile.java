package com.banque.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class Profile {
	@Id
	private long id;
	private String telephone;
	private String adresse;
	@MapsId
	@JoinColumn(name = "id")
	@OneToOne(cascade = CascadeType.ALL,optional = false)
	private Utilisateur utilisateur;

}
