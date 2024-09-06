package com.banque.model.mappers;

import org.modelmapper.ModelMapper;

import com.banque.model.dto.TransactionDto;
import com.banque.model.entities.Transaction;

public class TransactionMapper {
	private static final ModelMapper modelMapper= new ModelMapper();
	public static TransactionDto convertToDTO(Transaction transaction)
	{
	return modelMapper.map(transaction, TransactionDto.class);
	}

	public static Transaction convertToEntity(TransactionDto transactionDTO)
	{
	return modelMapper.map(transactionDTO, Transaction.class);	
	}
}
