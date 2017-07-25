package tr.org.linux.kamp.triangle;

import java.util.Scanner;

public class Triangle {

	double a;
	double b;

	public static double getHypo(double a, double b) {

		return Math.hypot(a, b);
	}

	public static double getArea(double a, double b) {
		return (a * b) / 2;
	}

	public static double getPerimeter(double a, double b) {
		return a + b + getHypo(a, b);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen birinci kenar uzunluğunu giriniz");
		double x = input.nextDouble();
		System.out.println("Lütfen ikinci kenar uzunluğunu giriniz");
		double y = input.nextDouble();
		System.out.println("Üçgenin alanı: " + getArea(x,y));
		System.out.println("Üçgenin çevresi: " + getPerimeter(x,y));
		System.out.println("Üçgenin hipotenusu: " + getHypo(x,y));
	}

}
