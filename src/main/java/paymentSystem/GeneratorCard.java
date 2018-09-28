package paymentSystem;

import paymentSystemTypes.FirstTypePaymentSystem;
import paymentSystemTypes.TypePaymentSystem;
import utils.RandomNumbersGenerator;

import java.util.ArrayList;
import java.util.List;

public class GeneratorCard {
	public static List<Integer> generatorCardNumberByTypeCard(String typeCard, String subtypeCard) {
		typeCard = typeCard + "_" + subtypeCard;
		TypePaymentSystem paymentSystem = TypePaymentSystem.valueOf(typeCard.toUpperCase());
		NomenclatureCard nomenclatureCard = paymentSystem.getNomenclatureCard();
		return generateCardNumberByPrefixAndCountNum(nomenclatureCard.getPrefix(), nomenclatureCard.getLengthCard());
	}


	public static List<Integer> generateCardNumberByPrefixAndCountNum(String prefix, int countNum) {
		List<Integer> cardNumber = new ArrayList<Integer>();
		for (String num : prefix.split("")) {
			cardNumber.add(Integer.parseInt(num));
		}
		cardNumber.addAll(generateNextDigits(countNum - cardNumber.size()));
		cardNumber.add(generateLastDigitByLuhna(cardNumber));
		return cardNumber;
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

