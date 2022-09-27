package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Transaction;
import com.example.repo.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	public Transaction addTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
	public List<Transaction> getAllTransaction(){
		return transactionRepository.findAll();
	}
	
	public int getRevenue() {
		return transactionRepository.getTotalRevenue();
	}
	
	public int getRevenueByCourse(int courseId) {
		return transactionRepository.getTotalRevenueByCourse(courseId);
	}
	
	public List<Transaction> getTransactionById(int courseId){
		return transactionRepository.findRevenueById(courseId);
	}
	
	public List<Transaction> getTransactionByDate(String startDate, String endDate){
		return transactionRepository.findRevenueByDate(startDate, endDate);
	}
	
	public int getTotalRevenueByDate(String startDate, String endDate) {
		return transactionRepository.findTotalRevenueByDate(startDate, endDate);
	}

}
