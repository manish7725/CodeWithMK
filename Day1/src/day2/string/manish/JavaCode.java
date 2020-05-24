/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.string.manish;

/**
 *
 * @author 1576202
 */
public class JavaCode {
    public static void main(String[] args) {
        //nonRepeating("dsfdfddferghhdy")
    	String s="dsfdfddferghhdy";
    		 String finalString = "";
    		 for(char c:s.toCharArray()){
	    		 if(!s.contains(c+"")){
	    			 finalString=finalString + c;
	    		 }
    		 }
                 System.out.println(finalString);
    		
    	 }
    }
    

