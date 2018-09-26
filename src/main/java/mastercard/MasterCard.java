package mastercard;

import paymentSystem.Card;
import utils.RandomNumbersGenerator;

public class MasterCard extends Card{

	private static final int PREFIX_MASTER_FIRST_LEFT = 51;
	private static final int PREFIX_MASTER_FIRST_RIGHT = 55;
	private static final int PREFIX_MASTER_SECOND_LEFT = 222100;
	private static final int PREFIX_MASTER_SECOND_RIGHT = 272099;
	private static final String TYPE_CARD = "MasterCard";


	public MasterCard() {
		super.typeCard = typeCard;
	}

	public String getPrefixPaymentSystem() {
		String result = "";
		if (RandomNumbersGenerator.rnd.nextBoolean()) {
			result = ((Integer) (RandomNumbersGenerator.rnd.nextInt(PREFIX_MASTER_FIRST_RIGHT - PREFIX_MASTER_FIRST_LEFT) + PREFIX_MASTER_FIRST_LEFT)).toString();
		} else {
			result = ((Integer) (RandomNumbersGenerator.rnd.nextInt(PREFIX_MASTER_SECOND_RIGHT - PREFIX_MASTER_SECOND_LEFT) + PREFIX_MASTER_SECOND_LEFT)).toString();
		}
		return result;
	}
}
