package paymentSystemTypes;

import paymentSystem.GeneratorNomenclaturesTypeCard;
import paymentSystem.NomenclatureCard;
import utils.RandomNumbersGenerator;

import java.util.List;

public enum TypePaymentSystem {
	MASTERCARD_CLASSIC {
		public NomenclatureCard getNomenclatureCard() {
			return getMastercardNomenclature(GeneratorNomenclaturesTypeCard.getMasterCardNomenclatures());
		}
	}, MASTERCARD_ELECTRONIC {
		public NomenclatureCard getNomenclatureCard() {
			return getMastercardNomenclature(GeneratorNomenclaturesTypeCard.getMasterCardNomenclatures());
		}
	}, MASTERCARD_MAESTRO{
		public NomenclatureCard getNomenclatureCard(){
			return getMastercardNomenclature(GeneratorNomenclaturesTypeCard.getMasterCardMaestroNomenclatures());
		}
	};

	public abstract NomenclatureCard getNomenclatureCard();

	private static NomenclatureCard getMastercardNomenclature(List<NomenclatureCard> nomenclatures) {
		int rnd = RandomNumbersGenerator.rnd.nextInt(nomenclatures.size());
		NomenclatureCard nc = nomenclatures.get(rnd);
		return nc;
	}

}
