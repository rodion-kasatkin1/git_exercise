package visa;

import paymentSystem.GeneratorCard;

public class VisaElectron extends Visa {
	private static final String SUB_TYPE_CARD = "electron";

	public VisaElectron() {
		super();
		super.subTypeCard = SUB_TYPE_CARD;
		super.cardNumber = GeneratorCard.generatorCardNumberByTypeCard(super.typeCard, super.subTypeCard);
	}
}
