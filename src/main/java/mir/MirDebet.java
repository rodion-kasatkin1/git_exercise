package mir;

import paymentSystem.GeneratorCard;

public class MirDebet extends Mir {
	private static final String SUB_TYPE_CARD = "Debet";
	public MirDebet() {
		super();
		super.subTypeCard = SUB_TYPE_CARD;
		super.cardNumber = GeneratorCard.generatorCardNumberByTypeCard(super.typeCard, super.subTypeCard);
	}
}
