package com.banque.model.entities;

import com.banque.model.BaseEntity;
import com.banque.model.Types;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
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
public class Transaction extends BaseEntity{
private double montant;
private Types type;
@ManyToOne(optional = true,fetch = FetchType.EAGER)
private Compte source;
@ManyToOne(optional = true,fetch = FetchType.EAGER)

private Compte destination;
}
