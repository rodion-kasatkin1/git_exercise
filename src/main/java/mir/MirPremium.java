package mir;

import paymentSystem.GeneratorCard;
import paymentSystemTypes.TypePaymentSystem;

public class MirPremium extends Mir {
	public MirPremium(int cardNumLength) {
		super();
		super.typePaymentSystem = TypePaymentSystem.MIR_PREMIUM;
		super.cardNumber = GeneratorCard.generatorCardNumberByPrefixAndLength(getPrefixCardNumber(), cardNumLength);
	}
}
