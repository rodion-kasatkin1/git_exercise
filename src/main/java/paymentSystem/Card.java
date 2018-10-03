package paymentSystem;

import paymentSystemTypes.TypePaymentSystem;

import java.util.List;

public abstract class Card {

	protected static final int LENGTH_MASTER_VISA_MIR_CARD = 16;
	protected List<Integer> cardNumber;
	protected TypePaymentSystem typePaymentSystem;

	public Card() {
	}

	protected abstract List<Integer> getPrefixCardNumber();

	public List<Integer> getCardNumber() {
		return cardNumber;
	}

	public TypePaymentSystem getTypePaymentSystem() {
		return typePaymentSystem;
	}

	public void setCardNumber(List<Integer> cardNumber) {
		this.cardNumber = cardNumber;
	}


}
