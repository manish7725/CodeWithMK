/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.map.manish.seperateChaining;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 1576202
 */
public class Solution1 {
    public static void main(String[] args) {
        int count=countPrimes(15);
        System.out.println(count);  //19 --> 19 --> 1
    }
     public static int countPrimes(int n) {
        boolean [] num=new boolean[n];
        
        int count=0;
        for(int i=0;i<n;i++){
            num[i]=true;
        }
        num[0]=false;
        num[1]=false;
        for(int i=1;i<n;i++){
            for(int j=2;j*j<=i;j++){
                if(num[j]==true){
                    if(i%j==0){
                        num[i]=false;
                    }
                    
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(num[i]==true)
                count++;
        }
        
       return count; 
    }
}

    
