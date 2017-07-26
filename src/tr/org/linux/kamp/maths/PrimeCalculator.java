/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.org.linux.kamp.maths;

import java.util.Scanner;

/**
 *
 * @author oyas
 */
public class PrimeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int number = input.nextInt();
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " bir asal sayı.");
        }
        else{
            System.out.println(number + " bir asal sayı değil.");
        }

    }

}
