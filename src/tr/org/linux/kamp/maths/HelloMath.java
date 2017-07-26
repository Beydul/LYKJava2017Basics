/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oyas
 */
public class HelloMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cod1e application logic here
        System.out.println(Math.max(10, 5));
        System.out.println(Math.min(10, 5));
        System.out.println(Math.log10(100));
        System.out.println(Math.pow(10, 2));
        System.out.println(Math.log10(Math.pow(10, 2)));        
        System.out.println(Math.sqrt(4));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = sc.nextInt();
        
        System.out.println(a);
        System.out.println(str);
    }
    
}
