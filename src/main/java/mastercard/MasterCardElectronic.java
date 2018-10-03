package mastercard;

import paymentSystem.GeneratorCard;
import paymentSystemTypes.TypePaymentSystem;

public class MasterCardElectronic extends MasterCard {
	public MasterCardElectronic(int cardNumLength) {
		super();
		super.typePaymentSystem = TypePaymentSystem.MASTERCARD_ELECTRONIC;
		super.cardNumber = GeneratorCard.generatorCardNumberByPrefixAndLength(getPrefixCardNumber(), cardNumLength);
	}
}
