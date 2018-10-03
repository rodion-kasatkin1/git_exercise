package mastercard;

import paymentSystem.Card;
import utils.RandomNumbersGenerator;

import java.util.ArrayList;
import java.util.List;

public abstract class MasterCard extends Card {

	private static final int PREFIX_MASTER_FIRST_LEFT = 51;
	private static final int PREFIX_MASTER_FIRST_RIGHT = 55;
	private static final int PREFIX_MASTER_SECOND_LEFT = 222100;
	private static final int PREFIX_MASTER_SECOND_RIGHT = 272099;

	public MasterCard() {
		super();
	}

	@Override
	protected List<Integer> getPrefixCardNumber() {
		List<Integer> cardPrefix = new ArrayList<>();
		String[] prefixString;
		if (RandomNumbersGenerator.rnd.nextBoolean()) {
			prefixString = String.valueOf(RandomNumbersGenerator.rnd.nextInt(PREFIX_MASTER_FIRST_RIGHT - PREFIX_MASTER_FIRST_LEFT) + PREFIX_MASTER_FIRST_LEFT).split("");
		} else {
			prefixString = String.valueOf(RandomNumbersGenerator.rnd.nextInt(PREFIX_MASTER_SECOND_RIGHT - PREFIX_MASTER_SECOND_LEFT) + PREFIX_MASTER_SECOND_LEFT).split("");
		}
		for (int i = 0; i < prefixString.length; i++) {
			cardPrefix.add(Integer.parseInt(prefixString[i]));
		}
		return cardPrefix;
	}
}
