package paymentSystem;

import java.util.*;

public class GeneratorNomenclaturesTypeCard {

	private static final int PREFIX_MASTER_FIRST_LEFT = 51;
	private static final int PREFIX_MASTER_FIRST_RIGHT = 55;
	private static final int PREFIX_MASTER_SECOND_LEFT = 222100;
	private static final int PREFIX_MASTER_SECOND_RIGHT = 272099;

	private static final int PREFIX_MAESTRO_ONE = 50;
	private static final int PREFIX_MAESTRO_TWO = 56;
	private static final int PREFIX_MAESTRO_THREE = 57;
	private static final int PREFIX_MAESTRO_FOUR = 58;
	private static final int PREFIX_MAESTRO_FIVE = 639;
	private static final int PREFIX_MAESTRO_SIX = 67;

	private static final int PREFIX_VISA = 67;


	private static final int LENGTH_MASTER_VISA_MIR_CARD = 16;
	private static final int LENGTH_MAESTRO_LEFT_BOUND = 12;
	private static final int LENGTH_MAESTRO_RIGHT_BOUND = 19;

	public static List<NomenclatureCard> getMasterCardNomenclatures() {
		List<NomenclatureCard> nomenclatures = new ArrayList<NomenclatureCard>();
		for (int i = PREFIX_MASTER_FIRST_LEFT; i < PREFIX_MASTER_FIRST_RIGHT; i++) {
			NomenclatureCard nc = new NomenclatureCard(String.valueOf(i), LENGTH_MASTER_VISA_MIR_CARD);
			nomenclatures.add(nc);
		}
		for (int i = PREFIX_MASTER_SECOND_LEFT; i < PREFIX_MASTER_SECOND_RIGHT; i++) {
			NomenclatureCard nc = new NomenclatureCard(String.valueOf(i), LENGTH_MASTER_VISA_MIR_CARD);
			nomenclatures.add(nc);
		}

		return nomenclatures;
	}
	public static List<NomenclatureCard> getMasterCardMaestroNomenclatures() {
		List<NomenclatureCard> nomenclatures = new ArrayList<NomenclatureCard>();
		for (int i = LENGTH_MAESTRO_LEFT_BOUND; i < LENGTH_MAESTRO_RIGHT_BOUND + 1; i++) {
			NomenclatureCard nc1 = new NomenclatureCard(String.valueOf(PREFIX_MAESTRO_ONE), i);
			nomenclatures.add(nc1);
			NomenclatureCard nc2 = new NomenclatureCard(String.valueOf(PREFIX_MAESTRO_TWO), i);
			nomenclatures.add(nc2);
			NomenclatureCard nc3 = new NomenclatureCard(String.valueOf(PREFIX_MAESTRO_THREE), i);
			nomenclatures.add(nc3);
			NomenclatureCard nc4 = new NomenclatureCard(String.valueOf(PREFIX_MAESTRO_FOUR), i);
			nomenclatures.add(nc4);
			NomenclatureCard nc5 = new NomenclatureCard(String.valueOf(PREFIX_MAESTRO_FIVE), i);
			nomenclatures.add(nc5);
			NomenclatureCard nc6 = new NomenclatureCard(String.valueOf(PREFIX_MAESTRO_SIX), i);
			nomenclatures.add(nc6);
		}
		return nomenclatures;
	}

	public static List<NomenclatureCard> getVisaNomenclotures() {
		List<NomenclatureCard> nomenclatures = new ArrayList<NomenclatureCard>();
		nomenclatures.add(new NomenclatureCard(String.valueOf(PREFIX_VISA), LENGTH_MASTER_VISA_MIR_CARD));
		return nomenclatures;
	}

}
