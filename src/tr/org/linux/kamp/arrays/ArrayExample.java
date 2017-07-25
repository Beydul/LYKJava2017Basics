package tr.org.linux.kamp.arrays;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample {
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Uzunluk girin:");
		int x = input.nextInt();
		String[] myStringArray = new String[x];
		String[] myAnotherStringArray = null;
		String[] myAnotherAnotherStringArray = {"Yavuz Çetin", "Kerim Çaplı"};
		
		System.out.println(myAnotherAnotherStringArray[1]);
		java.util.List<String> hey = new ArrayList<>();
	}

}
