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
public class MutabilityTest {
    public static void StrConcat(String str1) 
    { 
        str1 = str1.concat("Edureka"); 
        //str1=str1+"Edureka";  ==> //Hello   Edurek and Hell Edureka
    } 
   
    public static void StrBufConcat(StringBuffer str2) 
    { 
        str2.append("Edureka"); 
    } 
   
    public static void StrBuildConcat(StringBuilder str3) 
    { 
        str3.append("Edureka"); 
    } 
   
    public static void main(String[] args) 
    { 
        String str1 = "Hello!"; 
        StrConcat(str1); 
        System.out.println("The final String is - " + str1); 
   
        StringBuffer str2 = new StringBuffer("Hello!"); 
        StrBufConcat(str2); 
        System.out.println("The final String is - " + str2); 
   
        StringBuilder str3 = new StringBuilder("Hello!"); 
        StrBuildConcat(str3);
        System.out.println("The final String is -" + str3); 
    } 
}
