package com.banque.model.entities;

import java.util.Set;

import com.banque.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class Utilisateur extends BaseEntity {
	@Column(nullable = true)
private String nom;
	@Column(nullable = true,unique = true)
private String email;
@Column(nullable = true)
private String password;
@OneToMany(mappedBy = "utilisateur")
private Set<Compte> comptes;
@OneToOne(mappedBy = "utilisateur")
private Profile profile;
}
