package com.example.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.entity.Transaction;

import dto.TransactionDto;

@Component
public class TransactionDtoConverter {
	
	public TransactionDto entityToDto(Transaction transaction) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(transaction, TransactionDto.class);
	}
	
	
	public Transaction dtoToEntity(TransactionDto transactionDto) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(transactionDto, Transaction.class);
	}
	
	public List<TransactionDto> entityToDto(List<Transaction> transaction){
		return transaction.stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	public List<Transaction> dtoToEntity(List<TransactionDto> transactionDto){
		return transactionDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}
}
