package com.banque.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.banque.model.dto.TransactionDto;

public interface TransactionService {
public Page<TransactionDto> getAllTransactions(Pageable pageable);
public Optional<TransactionDto> getTransactionById(long id);
public TransactionDto addOneTransaction(TransactionDto transactionDto,long idSource,long idDestination);
public void updateSolde(double montant,long idCompte);
}
