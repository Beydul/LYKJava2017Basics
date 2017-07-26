/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.org.linux.kamp.strings;

import java.util.Scanner;

/**
 *
 * @author oyas
 */
public class EmailValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String mail = sc.next();
        System.out.println(isEmailValid(mail));
    }
    
    public static boolean isEmailValid(String str){
        if(str.contains(" ")){
            return false;
        }
        
        if(!str.contains("@")){
            return false;
        }
        
        if(!str.contains(".")){
            return false;
        }
        
        if(str.startsWith("@") || str.startsWith(".")){
            return false;
        }
        
        //if(str.lastIndexOf(".") - str.indexOf("@") < 1){
        if(str.contains("@.")){
            return false;
        }
        
        if(str.length()-str.lastIndexOf(".") <= 2){
            return false;
        }
        
        return true;
    }
    
}
