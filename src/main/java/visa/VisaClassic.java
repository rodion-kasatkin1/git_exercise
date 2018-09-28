package visa;

import paymentSystem.GeneratorCard;

public class VisaClassic extends Visa {
	private static final String SUB_TYPE_CARD = "Classic";

	public VisaClassic() {
		super();
		super.subTypeCard = SUB_TYPE_CARD;
		super.cardNumber = GeneratorCard.generatorCardNumberByTypeCard(super.typeCard, super.subTypeCard);
	}
}
