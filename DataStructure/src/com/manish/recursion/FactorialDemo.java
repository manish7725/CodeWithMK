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
public class FactorialDemo {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    
    public  static int fact(int n){
       if(n==1) return 1;
       return n*fact(n-1);
    }
    
}
