/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randoms;

import java.util.Random;

/**
 *
 * @author oyas
 */
public class HelloRandom {
    public static void main(String[] args) {
        System.out.println("Math random: " + Math.random());
        Random rgen = new Random();
        System.out.println("Rgen1 random next int: " + rgen.nextInt());
        //System.out.println("Rgen random next int: " + rgen.nextInt());

        //System.out.println("Rgen random next double: " + rgen.nextDouble());
        //System.out.println("Rgen random next boolean: " + rgen.nextBoolean());
        
        //Random rgen2 = new Random();
        //System.out.println("Rgen2 random next int: " + rgen2.nextInt());
        int result = rgen.nextInt(3)+8;
        System.out.println("Rgen random next int between 8-10: " + result);

    }
}
