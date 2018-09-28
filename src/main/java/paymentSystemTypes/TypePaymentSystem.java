package paymentSystemTypes;

import paymentSystem.GeneratorNomenclaturesTypeCard;
import paymentSystem.NomenclatureCard;
import utils.RandomNumbersGenerator;

import java.util.List;

public enum TypePaymentSystem {
	MASTERCARD_CLASSIC {
		public NomenclatureCard getNomenclatureCard() {
			return getMastercardNomenclature();
		}
	}, MASTERCARD_ELECTRONIC {
		public NomenclatureCard getNomenclatureCard() {
			return getMastercardNomenclature();
		}
	};

	public abstract NomenclatureCard getNomenclatureCard();

	private static NomenclatureCard getMastercardNomenclature() {
		List<NomenclatureCard> nomenclatures = GeneratorNomenclaturesTypeCard.getMasterCardNomenclatures();
		int rnd = RandomNumbersGenerator.rnd.nextInt(nomenclatures.size());
		NomenclatureCard nc = nomenclatures.get(rnd);
		return nc;
	}

}
