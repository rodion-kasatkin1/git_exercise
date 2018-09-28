package paymentSystem;

import java.util.Objects;

public class NomenclatureCard {
	private String prefix;
	private int lengthCard;

	public NomenclatureCard(String prefix, int lengthCard) {
		this.prefix = prefix;
		this.lengthCard = lengthCard;
	}

	public String getPrefix() {
		return prefix;
	}

	public int getLengthCard() {
		return lengthCard;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NomenclatureCard that = (NomenclatureCard) o;
		return lengthCard == that.lengthCard &&
				Objects.equals(prefix, that.prefix);
	}

	@Override
	public int hashCode() {
		return Objects.hash(prefix, lengthCard);
	}
}
