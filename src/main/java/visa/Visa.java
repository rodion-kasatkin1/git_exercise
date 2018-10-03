package visa;

import paymentSystem.Card;

import java.util.ArrayList;
import java.util.List;

public class Visa extends Card {

	private static final int PREFIX_VISA = 4;

	public Visa() {
	}

	@Override
	protected List<Integer> getPrefixCardNumber() {
		List<Integer> cardPrefix = new ArrayList<>();
		cardPrefix.add(PREFIX_VISA);
		return cardPrefix;
	}
}
