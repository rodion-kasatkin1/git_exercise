package paymentSystemTypes;

import paymentSystem.GeneratorNomenclaturesTypeCard;
import paymentSystem.NomenclatureCard;
import utils.RandomNumbersGenerator;

import java.util.List;

public enum TypePaymentSystem {
	MASTERCARD_CLASSIC {
		public NomenclatureCard getNomenclatureCard() {
			List<NomenclatureCard> nomenclatures = GeneratorNomenclaturesTypeCard.getMasterCardNomenclatures();
			int rnd = RandomNumbersGenerator.rnd.nextInt(nomenclatures.size());
			NomenclatureCard nc = nomenclatures.get(rnd);
			return nc;
		}
	};

	public abstract NomenclatureCard getNomenclatureCard();

}
