/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.org.linux.kamp.randoms;

import java.util.Random;

/**
 *
 * @author oyas
 */
public class MonteCarlo {
    private static Random rgen = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dartCount = 10000;
        int insideCount = 0;
        for(int i =0; i < dartCount;i++){
            if(isInCircle(getPoint(), getPoint())){
                insideCount++;
            }                
        }
        double pi = 4 * (insideCount*1.0/dartCount);
        System.out.println(pi);
    }
    
    public static double getPoint(){
        return (2 * rgen.nextDouble()) - 1 ;
    }
    
    public static boolean isInCircle(double x, double y){
        return Math.pow(x, 2) + Math.pow(y, 2) < 1;        
    }
    
}
