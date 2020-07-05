/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.map.manish.hashMapImpl;

/**
 *
 * @author 1576202
 */
public class EmployeeDemo {
    
    public static void main(String[] args) {
        Employee e1=new Employee(1, "Manish");
        System.out.println(e1);
         String s1= "a";     //95 %16  3
         String s2= "ab";    //95 %16  3
         String s3="ac";     //95      3
         String s4="ad";     //95      3
        
        //System.out.println(e1.hashCode());
        System.out.println(s1.hashCode()%32);  //  (0,31)  // hashCode  //Compression
        System.out.println(s2.hashCode()%32);
        System.out.println(s3.hashCode()%32);
        System.out.println(s4.hashCode()%32);
        
    }
    
    
    
}
