package mastercard;

import paymentSystem.GeneratorCard;
import paymentSystemTypes.TypePaymentSystem;

public class MasterCardClassic extends MasterCard {

	public MasterCardClassic(int cardNumLength) {
		super();
		super.typePaymentSystem = TypePaymentSystem.MASTERCARD_CLASSIC;
		super.cardNumber = GeneratorCard.generatorCardNumberByPrefixAndLength(getPrefixCardNumber(), cardNumLength);
	}
}
