package mir;

import paymentSystem.GeneratorCard;
import paymentSystemTypes.TypePaymentSystem;

public class MirClassic extends Mir{

	public MirClassic(int cardNumLength) {
		super();
		super.typePaymentSystem = TypePaymentSystem.MIR_CLASSIC;
		super.cardNumber = GeneratorCard.generatorCardNumberByPrefixAndLength(getPrefixCardNumber(), cardNumLength);
	}
}
