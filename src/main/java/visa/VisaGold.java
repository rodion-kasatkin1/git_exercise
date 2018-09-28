package visa;

import paymentSystem.GeneratorCard;

public class VisaGold extends Visa {
	private static final String SUB_TYPE_CARD = "Gold";

	public VisaGold() {
		super();
		super.subTypeCard = SUB_TYPE_CARD;
		super.cardNumber = GeneratorCard.generatorCardNumberByTypeCard(super.typeCard, super.subTypeCard);
	}
}
