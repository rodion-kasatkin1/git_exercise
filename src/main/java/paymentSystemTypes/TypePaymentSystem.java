package paymentSystemTypes;

import mastercard.Maestro;
import mastercard.MasterCardClassic;
import mastercard.MasterCardElectronic;
import mir.MirClassic;
import mir.MirDebet;
import mir.MirPremium;
import paymentSystem.Card;
import visa.VisaClassic;
import visa.VisaElectron;
import visa.VisaGold;


public enum TypePaymentSystem {
	MASTERCARD_CLASSIC {
		public Card getCardClass(int cardNumLength) {

			return new MasterCardClassic(cardNumLength);
		}
	}, MASTERCARD_ELECTRONIC {
		public Card getCardClass(int cardNumLength) {

			return new MasterCardElectronic(cardNumLength);
		}
	}, MASTERCARD_MAESTRO {
		public Card getCardClass(int cardNumLength) {
			return new Maestro( cardNumLength);
		}
	}, VISA_ELECTRON {
		public Card getCardClass(int cardNumLength) {

			return new VisaElectron(cardNumLength);
		}
	}, VISA_CLASSIC {
		public Card getCardClass(int cardNumLength) {
			return new VisaClassic(cardNumLength);
		}
	}, VISA_GOLD {
		public Card getCardClass(int cardNumLength) {

			return new VisaGold(cardNumLength);
		}
	}, MIR_CLASSIC {
		public Card getCardClass(int cardNumLength) {

			return new MirClassic(cardNumLength);
		}
	}, MIR_DEBET {
		public Card getCardClass(int cardNumLength) {

			return new MirDebet(cardNumLength);
		}
	}, MIR_PREMIUM {
		public Card getCardClass(int cardNumLength) {

			return new MirPremium(cardNumLength);
		}
	};

	public abstract Card getCardClass(int cardNumLength);
}
