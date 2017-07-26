/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randoms;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oyas
 */
public class DiceGame {
    private static Random rgen = new Random();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Oyuncu 1'in ismini giriniz:");
        String user1 = sc.next();
        
        System.out.println("Oyuncu 2'nin ismini giriniz:");
        String user2 = sc.next();
        
        int dice1 = roll();
        int dice2 = roll();
        
        System.out.println(user1+ "'in zarı: " + dice1);
        System.out.println(user2+ "'in zarı:" + dice2);
        String winner = "";
        /*if(dice1 > dice2){
            winner = user1;
        }
        else if(dice1==dice2){
            winner = "Berabere";
        }
        else{
            winner = user2;
        }*/
        
        winner = (dice1 > dice2) ? user1 : (dice1 == dice2) ? "Berabere" : user2; 
        
        System.out.println("Kazanan:" + winner);
        
    }
    
    public static int roll(){
        return rgen.nextInt(6)+1;       
    }
}
