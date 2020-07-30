package hu.ak_akademia.calculatoronweb;

public class Article {
	static String getNumberArticle(double number) {
		if (number == 1) return "az";
		
		if (number == 5) return "az";
		if (number == 50) return "az";
		if (number == 500) return "az";
		if (number == 5000) return "az";
		if (number == 50000) return "az";
		if (number == 500000) return "az";
		if (number == 5000000) return "az";
		if (number == 50000000) return "az";
		
		return "a";
	}
}
