package mastercard;

import paymentSystem.GeneratorCard;

public class MasterCardClassic extends MasterCard {
	private static final String SUB_TYPE_CARD = "classic";

	public MasterCardClassic(int countNum) {
		super();
		super.subTypeCard = SUB_TYPE_CARD;
		super.cardNumber = GeneratorCard.generateCardNumber(getPrefixPaymentSystem(), countNum);
	}
}
