package paymentSystemTypes;

import mastercard.Maestro;
import mastercard.MasterCardClassic;
import mastercard.MasterCardElectronic;
import mir.MirClassic;
import mir.MirDebet;
import paymentSystem.Card;
import paymentSystem.GeneratorNomenclaturesTypeCard;
import paymentSystem.NomenclatureCard;
import utils.RandomNumbersGenerator;
import visa.VisaClassic;
import visa.VisaElectron;
import visa.VisaGold;

import java.util.List;

public enum TypePaymentSystem {
	MASTERCARD_CLASSIC {
		public Card getCardClass() {
			return new MasterCardClassic();
		}

		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getMasterCardNomenclatures());
		}
	}, MASTERCARD_ELECTRONIC {
		public Card getCardClass() {
			return new MasterCardElectronic();
		}

		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getMasterCardNomenclatures());
		}
	}, MASTERCARD_MAESTRO {
		public Card getCardClass() {
			return new Maestro();
		}

		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getMasterCardMaestroNomenclatures());
		}
	}, VISA_ELECTRON {
		public Card getCardClass() {
			return new VisaElectron();
		}

		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getVisaNomenclatures());
		}
	}, VISA_CLASSIC {
		public Card getCardClass() {
			return new VisaClassic();
		}

		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getVisaNomenclatures());
		}

	}, VISA_GOLD {
		public Card getCardClass() {
			return new VisaGold();
		}

		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getVisaNomenclatures());
		}
	}, MIR_CLASSIC {
		public Card getCardClass() {
			return new MirClassic();
		}

		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getMirNomenclatures());
		}
	},MIR_DEBET {
		public Card getCardClass() {
			return new MirDebet();
		}

		public NomenclatureCard getNomenclatureCard() {
			return getRandomCardNomenclature(GeneratorNomenclaturesTypeCard.getMirNomenclatures());
		}
	};

	public abstract NomenclatureCard getNomenclatureCard();

	public abstract Card getCardClass();

	private static NomenclatureCard getRandomCardNomenclature(List<NomenclatureCard> nomenclatures) {
		int rnd = RandomNumbersGenerator.rnd.nextInt(nomenclatures.size());
		NomenclatureCard nc = nomenclatures.get(rnd);
		return nc;
	}

}
