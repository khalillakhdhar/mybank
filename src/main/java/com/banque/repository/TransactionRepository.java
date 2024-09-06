package com.banque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banque.model.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
