package com.banque.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.banque.model.dto.CompteDto;

public interface CompteService {
Page<CompteDto> getAllComptes(Pageable pageable);
public void deleteOneCompte(long id);
public CompteDto getCompteById(long id);
}
