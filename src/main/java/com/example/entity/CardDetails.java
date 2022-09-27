package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="card_details")
public class CardDetails {

	@Id
	@Column(name="card_number")
	private String cardNumber;
	
	@Column(name="exp_date")
	private String expDate;
	
	@Column(name="card_type")
	private String cardType;
	
	@Column(name="card_cvv")
	private String cardCVV;
	
	@Column(name="name_on_card")
	private String nameOnCard;

	public CardDetails() {
		super();
	}

	public CardDetails(String cardNumber, String expDate, String cardType, String cardCVV, String nameOnCard) {
		super();
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.cardType = cardType;
		this.cardCVV = cardCVV;
		this.nameOnCard = nameOnCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardCVV() {
		return cardCVV;
	}

	public void setCardCVV(String cardCVV) {
		this.cardCVV = cardCVV;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	
	
}
