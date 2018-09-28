package paymentSystemTypes;

import utils.RandomNumbersGenerator;

import java.util.Random;

public enum FirstTypePaymentSystem {

	MASTERCARD {
		public String getPrefixPaymentSystem() {
			String result = "";
			if (RandomNumbersGenerator.rnd.nextBoolean()) {
				result = ((Integer) (RandomNumbersGenerator.rnd.nextInt(PREFIX_MASTER_FIRST_RIGHT - PREFIX_MASTER_FIRST_LEFT) + PREFIX_MASTER_FIRST_LEFT)).toString();
			} else {
				result = ((Integer) (RandomNumbersGenerator.rnd.nextInt(PREFIX_MASTER_SECOND_RIGHT - PREFIX_MASTER_SECOND_LEFT) + PREFIX_MASTER_SECOND_LEFT)).toString();
			}
			return result;
		}
	}, VISA {
		public String getPrefixPaymentSystem() {
			return ((Integer) PREFIX_VISA).toString();
		}
	}, MIR {
		public String getPrefixPaymentSystem() {
			return ((Integer) (RandomNumbersGenerator.rnd.nextInt(PREFIX_MIR_RIGHT - PREFIX_MIR_LEFT) + PREFIX_MIR_LEFT)).toString();
		}
	};
	private static final int PREFIX_MASTER_FIRST_LEFT = 51;
	private static final int PREFIX_MASTER_FIRST_RIGHT = 55;
	private static final int PREFIX_MASTER_SECOND_LEFT = 222100;
	private static final int PREFIX_MASTER_SECOND_RIGHT = 272099;
	private static final int PREFIX_VISA = 4;
	private static final int PREFIX_MIR_LEFT = 2200;
	private static final int PREFIX_MIR_RIGHT = 2204;

	public abstract String getPrefixPaymentSystem();
}
