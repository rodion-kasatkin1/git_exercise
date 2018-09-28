package mastercard;

import paymentSystem.GeneratorCard;

public class MasterCardElectronic extends MasterCard {
	private static final String SUB_TYPE_CARD = "electronic";

	public MasterCardElectronic() {
		super();
		super.subTypeCard = SUB_TYPE_CARD;
		super.cardNumber = GeneratorCard.generatorCardNumberByTypeCard(super.typeCard, super.subTypeCard);
	}
}