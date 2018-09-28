package mastercard;

import paymentSystem.Card;
import paymentSystem.GeneratorNomenclaturesTypeCard;
import paymentSystem.NomenclatureCard;
import utils.RandomNumbersGenerator;

import java.util.List;

public class MasterCard extends Card {

	private static final int PREFIX_MASTER_FIRST_LEFT = 51;
	private static final int PREFIX_MASTER_FIRST_RIGHT = 55;
	private static final int PREFIX_MASTER_SECOND_LEFT = 222100;
	private static final int PREFIX_MASTER_SECOND_RIGHT = 272099;
	private int countNumbers;


	private static final String TYPE_CARD = "MasterCard";


	public MasterCard() {
		List<NomenclatureCard> nomenclatures = GeneratorNomenclaturesTypeCard.getMasterCardNomenclatures();
		int rnd = RandomNumbersGenerator.rnd.nextInt(nomenclatures.size());
		NomenclatureCard nc = nomenclatures.get(rnd);
		super.countNum = nc.getLengthCard();
		super.prefix = nc.getPrefix();
		super.typeCard = typeCard;


	}


}
