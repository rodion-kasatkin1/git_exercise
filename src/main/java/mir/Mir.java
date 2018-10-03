package mir;

import paymentSystem.Card;
import utils.RandomNumbersGenerator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mir extends Card {

	private static final int PREFIX_MIR_LEFT = 2200;
	private static final int PREFIX_MIR_RIGHT = 2204;

	public Mir() {
		super();
	}

	@Override
	protected List<Integer> getPrefixCardNumber() {
		List<Integer> cardPrefix = new ArrayList<>();
		String[] prefixString = String.valueOf(RandomNumbersGenerator.rnd.nextInt(PREFIX_MIR_RIGHT - PREFIX_MIR_LEFT) + PREFIX_MIR_LEFT).split("");
		for (int i = 0; i < prefixString.length; i++) {
			cardPrefix.add(Integer.parseInt(prefixString[i]));
		}
		return cardPrefix;
	}
}
