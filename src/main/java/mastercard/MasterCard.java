package mastercard;

import paymentSystem.Card;
import paymentSystem.GeneratorNomenclaturesTypeCard;
import paymentSystem.NomenclatureCard;
import utils.RandomNumbersGenerator;

import java.util.List;

public class MasterCard extends Card {

	private static final String TYPE_CARD = "MasterCard";

	public MasterCard() {
		super();
		super.typeCard = TYPE_CARD;
	}


}
