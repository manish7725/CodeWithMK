/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.string.manish;

import java.util.Arrays;

/**
 *
 * @author 1576202
 */
public class ConversionBetweenStringAndBuilder {
    public static void main(String[] args) {
        String s="Manish";
        
        StringBuffer sb1=new StringBuffer(s);
        
        StringBuffer sb2=new StringBuffer("Manish2");
        System.out.println(sb2.toString());
        //System.out.println(sb1);
        
        String s2= sb1.toString();
        
      
        
        
    }
    
}
