package visa;

import paymentSystem.GeneratorCard;
import paymentSystemTypes.TypePaymentSystem;

public class VisaClassic extends Visa {
	public VisaClassic(int cardNumLength) {
		super();
		super.typePaymentSystem = TypePaymentSystem.VISA_CLASSIC;
		super.cardNumber = GeneratorCard.generatorCardNumberByPrefixAndLength(getPrefixCardNumber(), cardNumLength);
	}
}
