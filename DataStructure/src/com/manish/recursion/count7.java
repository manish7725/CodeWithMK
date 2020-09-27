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
public class count7 {
    public static void main(String args[]){
        System.out.println(count7(7178763));
    
    }
    
    public static int count7(int n){
        if(n<7){
            return 0;
        }
        if(n%10==7)
        return 1+count7(n/10);
        else
        return 0+count7(n/10);    
        
    }
    
}
