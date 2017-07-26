/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.org.linux.kamp.characters;

import java.util.Random;

/**
 *
 * @author oyas
 */
public class HelloChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //char char_a = 97;
        
        //char a = 'a';
        //System.out.println((char)(97*4));
        
        //System.out.println(Character.toUpperCase('a'));
        //System.out.println(Character.toUpperCase('2'));
        //System.out.println(Character.toLowerCase('A'));
        
        Random rgen = new Random();
        char a = (char) (rgen.nextInt(26)+'A');
        System.out.println(a);
        
    }
    
}
