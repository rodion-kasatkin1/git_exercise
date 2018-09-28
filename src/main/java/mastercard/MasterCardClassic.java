package mastercard;

import paymentSystem.GeneratorCard;

public class MasterCardClassic extends MasterCard {
	private static final String SUB_TYPE_CARD = "classic";

	public MasterCardClassic() {
		super();
		super.subTypeCard = SUB_TYPE_CARD;
		super.cardNumber = GeneratorCard.generatorCardNumberByTypeCard(super.typeCard, super.subTypeCard);
	}
}
