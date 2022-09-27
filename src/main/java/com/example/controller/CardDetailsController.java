package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.CardDetails;
import com.example.service.CardDetailsService;

@RestController
@CrossOrigin(origins = "*")
public class CardDetailsController {
	
	@Autowired
	private CardDetailsService cardDetailService;
	
	@GetMapping("/card-details")
	public List<CardDetails> getAllCardDetails() {
		return this.cardDetailService.getCardDetails();
	}
	

}
