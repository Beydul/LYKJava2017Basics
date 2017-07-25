package tr.org.linux.kamp.sphere;

import java.util.Scanner;

public class Sphere {

	public static double getVolume(double r) {
		return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen hacmini hesaplamak istediğiniz kürenin yarıçapını giriniz");
		double radius = input.nextDouble();
		System.out.println(radius + " yarıçaplı kürenin hacmi: " + getVolume(radius));
	}

}
