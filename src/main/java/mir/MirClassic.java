package mir;

import paymentSystem.GeneratorCard;

public class MirClassic extends Mir{
	private static final String SUB_TYPE_CARD = "mir";
	public MirClassic() {
		super();
		super.subTypeCard = SUB_TYPE_CARD;
		super.cardNumber = GeneratorCard.generatorCardNumberByTypeCard(super.typeCard, super.subTypeCard);
	}
}
