package paymentSystem;

import paymentSystemTypes.FirstTypePaymentSystem;
import utils.RandomNumbersGenerator;

import java.util.ArrayList;
import java.util.List;

public class GeneratorCard {

	public static Card generateCard(String typeCard, int countNumbers) {
		FirstTypePaymentSystem paymentSystem = FirstTypePaymentSystem.valueOf(typeCard.split("_")[0].toUpperCase());
		List<Integer> cardNumber = new ArrayList<Integer>();
		Card card = new Card(paymentSystem, cardNumber);
		String prefix = paymentSystem.getPrefixPaymentSystem();

		for (String num : prefix.split("")) {
			cardNumber.add(Integer.parseInt(num));
		}
		cardNumber.addAll(generateNextDigits(countNumbers - cardNumber.size()));
		cardNumber.add(generateLastDigitByLuhna(cardNumber));
		return card;
	}

	private static List<Integer> generateNextDigits(int countNumbers) {
		List<Integer> digits = new ArrayList<Integer>();
		for (int i = 0; i < countNumbers; i++) {
			digits.add(RandomNumbersGenerator.rnd.nextInt(9));
		}
		return digits;
	}

	private static int generateLastDigitByLuhna(List<Integer> cardNumder) {
		int sum = 0;
		int length = cardNumder.size();
		for (int i = 0; i < length; i++) {

			// get digits in reverse order
			int digit = cardNumder.get(length - i - 1);

			// every 2nd number multiply by 2
			if (i % 2 == 1) {
				digit *= 2;
			}
			sum += digit > 9 ? digit - 9 : digit;
		}
		int lastDigit = new Double(
				((Math.floor(sum / 10) + 1) * 10 - sum) % 10).intValue();
		return lastDigit;

	}


}

