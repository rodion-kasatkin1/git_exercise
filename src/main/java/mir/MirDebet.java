package mir;

import paymentSystem.GeneratorCard;
import paymentSystemTypes.TypePaymentSystem;

public class MirDebet extends Mir {
	public MirDebet(int cardNumLength) {
		super();
		super.typePaymentSystem = TypePaymentSystem.MIR_DEBET;
		super.cardNumber = GeneratorCard.generatorCardNumberByPrefixAndLength(getPrefixCardNumber(), cardNumLength);
	}
}
