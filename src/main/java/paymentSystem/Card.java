package paymentSystem;

import paymentSystemTypes.FirstTypePaymentSystem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Card {
	protected List<Integer> cardNumber;
	protected String typeCard;
	protected String subTypeCard;
	protected int countNum;
	protected String prefix;
	public Card() {
	}

	public Card(List<Integer> cardNumber) {

		this.cardNumber = cardNumber;
	}

	public List<Integer> getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(List<Integer> cardNumber) {
		this.cardNumber = cardNumber;
	}
	

}
