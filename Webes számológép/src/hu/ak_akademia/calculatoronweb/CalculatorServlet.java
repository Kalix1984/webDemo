package hu.ak_akademia.calculatoronweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		String operation = request.getParameter("operation");
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String result = null;

		try {
			double a_num = new NumberParser().convert(a);
			double b_num = new NumberParser().convert(b);
			Calculator calculator = null;

			switch (operation) {
			case "addition":
				calculator = new Addition(a_num, b_num);
				calculator.calculate();
				break;
			case "substraction":
				calculator = new Substraction(a_num, b_num);
				calculator.calculate();
				break;
			case "multiplication":
				calculator = new Multiplication(a_num, b_num);
				calculator.calculate();
				break;
			case "division":
				calculator = new Division(a_num, b_num);
				calculator.calculate();
				break;
			}
			
			result = calculator.generateResultText();

		} catch (NumberFormatException e) {
			result = "A mezők tartalma csak szám lehet!";
		} catch (IllegalArgumentException e) {
			result = "Nullával való osztás nem lehetséges!";
		}

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>                 ");
		out.println("<html>                          ");
		out.println("<head>                          ");
		out.println("<meta charset=\"UTF-8\">          ");
		out.println("<title>Webes számológép</title> ");
		out.println("</head>                         ");
		out.println("<body>                          ");
		out.println("<h1>Eredmény</h1>               ");
		out.println("<p>" + result + "</p>                 ");
		out.println("</body>                         ");
		out.println("</html>                         ");

	}

}
