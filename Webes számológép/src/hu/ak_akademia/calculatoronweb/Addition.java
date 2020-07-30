package hu.ak_akademia.calculatoronweb;

import static hu.ak_akademia.calculatoronweb.Article.getNumberArticle;

public class Addition implements Calculator {
	private double a;
	private double b;
	private double c;

	public Addition(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void calculate() {
		c = a + b;
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
		result.append("összege");
		result.append(" ");
		result.append(c);
		result.append(".");

		return result.toString();
	}
}
