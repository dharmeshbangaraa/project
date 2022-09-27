package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.converter.TransactionDtoConverter;
import com.example.entity.Transaction;
import com.example.service.TransactionService;

import dto.TransactionDto;

@RestController
@CrossOrigin(origins="*")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	@Autowired TransactionDtoConverter converter;
	
	@PostMapping("/transaction")
	public TransactionDto addTransaction(@RequestBody TransactionDto transactionDto) {
		Transaction transaction = converter.dtoToEntity(transactionDto);
		transaction = transactionService.addTransaction(transaction);
		return converter.entityToDto(transaction);
	}
	
	@GetMapping("/transaction")
	public List<Transaction> getAllTransaction(){
		return transactionService.getAllTransaction();
	}
	
	@GetMapping("/total-revenue")
	public int getTotalRevenue() {
		return transactionService.getRevenue();
	}
	
	@GetMapping("/total-revenue/{courseId}")
	public int getTotalRevenueByCourse(@PathVariable int courseId) {
		return transactionService.getRevenueByCourse(courseId);
	}
	
	@GetMapping("/transaction/{courseId}")
	public List<Transaction> getTransactionById(@PathVariable int courseId){
		return transactionService.getTransactionById(courseId);
	}
	
	@GetMapping("/transaction/{startDate}/{endDate}")
	public List<Transaction> getTransactionByDate(@PathVariable String startDate, @PathVariable String endDate){
		return transactionService.getTransactionByDate(startDate, endDate);
	}
	
	@GetMapping("total-revenue/{startDate}/{endDate}")
	public int getTotalRevenueByDate(@PathVariable String startDate, @PathVariable String endDate) {
		return transactionService.getTotalRevenueByDate(startDate, endDate);
	}
	
}
