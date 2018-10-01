package executor;

import paymentSystem.Card;
import paymentSystemTypes.TypePaymentSystem;

public class AppStarter {
	public static void main(String[] args) {
		System.out.println(args[0]);
		Card card = TypePaymentSystem.valueOf(args[0].toUpperCase()).getCardClass();
		System.out.println(card.getCardNumber());

	}
}
