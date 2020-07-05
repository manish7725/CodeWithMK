/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 1576202
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("Hello"));
        List<Integer> l=new LinkedList();
        
    }
    
    public static  String defangIPaddr(String letter) {
        char [] c=new char[letter.length()];
       
        for(int i=0;i<letter.length();i++){
           if(letter.charAt(i)-'A'>=0) 
           c[i]=(char)(letter.charAt(i)-'A'+'a');
           else
           c[i]= (char)letter.charAt(i);   
         }
     return new String(c);   
    }
}
    
