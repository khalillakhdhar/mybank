package com.banque.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
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
public class TransactionDto extends BaseDto {
	@Positive
	@Min(value = 10)
	private double monant;
	@JsonIgnoreProperties("transactions")
	private CompteDto source;
	@JsonIgnoreProperties("transactions")
	private CompteDto destination;
}
