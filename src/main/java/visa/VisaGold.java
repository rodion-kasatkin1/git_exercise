package visa;

import paymentSystem.GeneratorCard;
import paymentSystemTypes.TypePaymentSystem;

public class VisaGold extends Visa {

	public VisaGold(int cardNumLength) {
		super();
		super.typePaymentSystem = TypePaymentSystem.VISA_GOLD;
		super.cardNumber = GeneratorCard.generatorCardNumberByPrefixAndLength(getPrefixCardNumber(), cardNumLength);
	}
}
