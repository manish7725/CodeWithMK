/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.recursion;

/**
 *
 * @author 1576202
 */
public class RecursionDemo {
    public static void main(String[] args) {
       print(10); 
    }
    
    public static void print(int n){
        if(n>=1)
        {
            print(n-1);
            System.out.println(n);
        }
        
       
     
        
    }
    
}
