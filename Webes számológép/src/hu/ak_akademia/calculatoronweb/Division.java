package hu.ak_akademia.calculatoronweb;

import static hu.ak_akademia.calculatoronweb.Article.getNumberArticle;

public class Division implements Calculator {
	private double a;
	private double b;
	private double c;

	public Division(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void calculate() {
		if (b == 0) throw new IllegalArgumentException();
		
		c = (a + 0.0) / b;
	}

	@Override
	public String generateResultText() {
		StringBuilder result = new StringBuilder();

		result.append(getNumberArticle(a));
		result.append(" ");
		result.append(a);
		result.append(" ");
		result.append("és");
		result.append(" ");
		result.append(getNumberArticle(b));
		result.append(" ");
		result.append(b);
		result.append(" ");
		result.append("hányadosa");
		result.append(" ");
		result.append(c);
		result.append(".");

		return result.toString();
	}
}
