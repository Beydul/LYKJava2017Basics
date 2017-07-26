/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author oyas
 */
public class HelloString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //String str = Integer.toString(115);
        //System.out.println(str);
        String str = "hello world";
        //System.out.println(str.charAt(11));
        //System.out.println(str.substring(0,11));
        //System.out.println(str.substring(str.indexOf(' ')+1,str.length()));
        //System.out.println(str.charAt(str.length()-1));
        //System.out.println(str.substring(0,2)=="he");
        //System.out.println(str.substring(0,2).equals("he"));
        //System.out.println(ourToUpperCase(str).equals(str.toUpperCase()));
        //System.out.println(reverseString(str));
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome("ey edip adanada pide ye"));
    }
    
    public static String ourToUpperCase(String str){
        String result = "";
        for(int i = 0; i < str.length();i++){
            result += Character.toUpperCase(str.charAt(i));
        }
        return result;
    }
    
    public static String reverseString(String str){
        String result = "";
        /*for(int i = str.length()-1; i >= 0;i--){
            result += str.charAt(i);
        }*/
        for(int i = 0; i < str.length();i++){
            result += str.charAt(str.length() - i - 1);
        }
        return result;
    }
    
    public static boolean isPalindrome(String str){
        return str.equals(reverseString(str));
    }
    
}
