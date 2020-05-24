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
public class RemoveDuplicates {
    
    public static void main(String[] args) {
        String s="AABCDDEFGH";
        s= removeDuplicate(s);
        System.out.println(s);
    }
     public static String removeDuplicate(String s){
     int index=0;   
        
     char [] charArray=s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int j;
            for( j=0;j<=i;j++){
             if(charArray[i]==charArray[j]){
               break;
             }
            }
         if(j==i)  { 
         charArray[index]=charArray[i];  
              index++;
         }
        }
       return new String(charArray);

    }
    
}
