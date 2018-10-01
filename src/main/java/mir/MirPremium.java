package mir;

import paymentSystem.GeneratorCard;

public class MirPremium extends Mir {
	private static final String SUB_TYPE_CARD = "premium";
	public MirPremium() {
		super();
		super.subTypeCard = SUB_TYPE_CARD;
		super.cardNumber = GeneratorCard.generatorCardNumberByTypeCard(super.typeCard, super.subTypeCard);
	}
}
