package mastercard;

import paymentSystem.GeneratorCard;

public class Maestro extends MasterCard{
	private static final String SUB_TYPE_CARD = "maestro";

	public Maestro() {
		super();
		super.subTypeCard = SUB_TYPE_CARD;
		super.cardNumber = GeneratorCard.generatorCardNumberByTypeCard(super.typeCard, super.subTypeCard);
	}

}
