package paymentSystem;

import java.util.*;

public class GeneratorNomenclaturesTypeCard {

	private static final int PREFIX_MASTER_FIRST_LEFT = 51;
	private static final int PREFIX_MASTER_FIRST_RIGHT = 55;
	private static final int PREFIX_MASTER_SECOND_LEFT = 222100;
	private static final int PREFIX_MASTER_SECOND_RIGHT = 272099;
	private static final int LENGTH_CARD = 16;

	public static List<NomenclatureCard> getMasterCardNomenclatures() {
		List<NomenclatureCard> nomenclatures = new ArrayList<NomenclatureCard>();
		for (int i = PREFIX_MASTER_FIRST_LEFT; i < PREFIX_MASTER_FIRST_RIGHT; i++) {
			NomenclatureCard nc = new NomenclatureCard(String.valueOf(i),LENGTH_CARD);
			nomenclatures.add(nc);
		}
		for (int i = PREFIX_MASTER_SECOND_LEFT; i < PREFIX_MASTER_SECOND_RIGHT; i++) {
			NomenclatureCard nc = new NomenclatureCard(String.valueOf(i),LENGTH_CARD);
			nomenclatures.add(nc);
		}

		return nomenclatures;
	}
}
