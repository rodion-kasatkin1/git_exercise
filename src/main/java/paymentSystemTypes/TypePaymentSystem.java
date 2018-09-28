package paymentSystemTypes;

import paymentSystem.GeneratorNomenclaturesTypeCard;
import paymentSystem.NomenclatureCard;
import utils.RandomNumbersGenerator;

import java.util.List;

public enum TypePaymentSystem {
	MASTERCARD_CLASSIC {
		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getMasterCardNomenclatures());
		}
	}, MASTERCARD_ELECTRONIC {
		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getMasterCardNomenclatures());
		}
	}, MASTERCARD_MAESTRO {
		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getMasterCardMaestroNomenclatures());
		}
	}, VISA_ELECTRON {
		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getVisaNomenclotures());
		}
	}, VISA_CLASSIC {
		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getVisaNomenclotures());
		}
	};

	public abstract NomenclatureCard getNomenclatureCard();

	private static NomenclatureCard getRandomCardNomenclature(List<NomenclatureCard> nomenclatures) {
		int rnd = RandomNumbersGenerator.rnd.nextInt(nomenclatures.size());
		NomenclatureCard nc = nomenclatures.get(rnd);
		return nc;
	}

}
