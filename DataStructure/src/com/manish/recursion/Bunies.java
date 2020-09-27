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
public class Bunies {
    public static void main(String[] args) {
        System.out.println(bunies(3));
    }
    
    public static int bunies(int n){
      int ears=0;
      if(n==0) return 0;
      if(n%2==0){
       return 3+bunies(n-1);
      }
      if(n%2==1){
      return 2+bunies(n-1);
      }
      return 0;
      
    
    } 
    
}
