package paymentSystem;

import paymentSystemTypes.FirstTypePaymentSystem;

import java.util.List;

public class Card {
	FirstTypePaymentSystem firstType;
	List<Integer> cardNumber;

	public Card() {
	}

	public Card(FirstTypePaymentSystem firstType, List<Integer> cardNumber) {
		this.firstType = firstType;
		this.cardNumber = cardNumber;
	}

	public FirstTypePaymentSystem getFirstType() {
		return firstType;
	}

	public void setFirstType(FirstTypePaymentSystem firstType) {
		this.firstType = firstType;
	}

	public List<Integer> getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(List<Integer> cardNumber) {
		this.cardNumber = cardNumber;
	}


}
