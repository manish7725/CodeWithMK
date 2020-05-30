/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.string.manish;

import day1.array.manish.ArrayList;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 *
 * @author 1576202
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        StringImp si=new StringImp();
        
//        String s="Manish";
//        String s1=new String("Manish");
//        String s3=s1;
//        System.out.println(s1.equals(s3));
//        //System.out.println(s1==s3);
//        
//        char [] s2={'M','a','n','i','s','h'};
//        
//
//        
//        si.printEachCharacterInString(s2);
//        si.printEachCharacterInString(s);
//        si.printEachCharacterInString(new String(s2));
//        si.printEachCharacterInString(s.toCharArray());
//
//        
//         String germanString = "Entwickeln Sie mit Vergnügen";
//         byte[] germanBytes = germanString.getBytes();
//         
//         for(int i=0;i<germanBytes.length;i++){
//             System.out.println(germanBytes[i]);
//         }
// 
//        String asciiEncodedString = new String(germanBytes, StandardCharsets.US_ASCII );
//        System.out.println(asciiEncodedString);
//        
//        
//        String rawString = "Entwickeln Sie mit Vergnügen";
//          byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);
// 
//        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
// 
//        System.out.println(utf8EncodedString);
         
         
//        int x=si.maximumOccuringCharacter("ABCCCCDDDEAFGaaaabbbbbbbbb");
//        //String s=Integer.toString(x);
//        System.out.println((char)x);
//        
//        si.printEachCharacterInString("ABCDEF");
//        char [] characterArray={'a','a','b','c'};
//        String result=si.removeDuplicate(characterArray);  //ABCD
//        
//        System.out.println(result);
        
        //System.out.println(result);
        // ABCDE  DEABC  -->true 
         ///MANISH ANISHM  NISHMA   ISHMAN
//         boolean b=si.checkStringsAreRotaionOfOther("MANISH","ANSHIM");
//         System.out.println(b);
         
//         String s=si.reverseString("Manish");  
//         System.out.println(s);
        
//            String s= si.printNonRepeatingCharacter("MMMAANISHHP");
//            System.out.println(s);

           boolean b= si.checkAnagramOfBinaryRepresentationAndItsComplement(8);
           System.out.println(b);
        
    }
    
    
}
