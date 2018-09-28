package visa;

import paymentSystem.Card;

public class Visa extends Card {

	private static final String TYPE_CARD = "Visa";

	public Visa (){
		super();
		super.typeCard = TYPE_CARD;
	}
}
