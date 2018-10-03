package mastercard;

import paymentSystem.GeneratorCard;
import paymentSystemTypes.TypePaymentSystem;
import utils.RandomNumbersGenerator;

import java.util.ArrayList;
import java.util.List;

public class Maestro extends MasterCard {
	private static final int[] PREFIXES_MAESTRO = {50, 56, 57, 58, 639, 67};

	public Maestro(int cardNumLength) {
		super();
		super.typePaymentSystem = TypePaymentSystem.MASTERCARD_MAESTRO;
		super.cardNumber = GeneratorCard.generatorCardNumberByPrefixAndLength(getPrefixCardNumber(), cardNumLength);
	}

	@Override
	protected List<Integer> getPrefixCardNumber() {
		List<Integer> cardPrefix = new ArrayList<>();
		String[] prefixString = String.valueOf(PREFIXES_MAESTRO[RandomNumbersGenerator.rnd.nextInt(PREFIXES_MAESTRO.length)]).split("");
		for (int i = 0; i < prefixString.length; i++) {
			cardPrefix.add(Integer.parseInt(prefixString[i]));
		}
		return cardPrefix;
	}
}
