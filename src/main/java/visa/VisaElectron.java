package visa;

import paymentSystem.GeneratorCard;
import paymentSystemTypes.TypePaymentSystem;

public class VisaElectron extends Visa {

	public VisaElectron(int cardNumLength) {
		super();
		super.typePaymentSystem = TypePaymentSystem.VISA_ELECTRON;
		super.cardNumber = GeneratorCard.generatorCardNumberByPrefixAndLength(getPrefixCardNumber(), cardNumLength);
	}
}
