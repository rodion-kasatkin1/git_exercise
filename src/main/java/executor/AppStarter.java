package executor;

import paymentSystem.Card;
import paymentSystemTypes.TypePaymentSystem;

import java.util.HashSet;
import java.util.Set;

public class AppStarter {
	public static final int COUNT_CARDS = 5;

	public static void main(String[] args) {
		System.out.println(args[0] + " " + args[1]);
		Set<Card> cards = new HashSet<>();
		for (int i = 0; i < COUNT_CARDS; i++) {
			cards.add(TypePaymentSystem.valueOf(args[0].toUpperCase()).getCardClass(Integer.parseInt(args[1])));
		}
		for (Card card : cards) {
			System.out.println(card.getCardNumber());
		}

	}
}
