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
public interface StringADT {
    
   
    public void printEachCharacterInString(String s);
    
    public int  maximumOccuringCharacter(String s);
    
    public String removeDuplicate(char [] s);
    
     //MANISH--> ANISHM  -> NISHMA--> ISHMAN
    public boolean checkStringsAreRotaionOfOther(String s1,String s2);  //   --> Reimplement--> Permutation
    
    public String reverseString(String s);
    
    // AAABCDDDEEFGH  BCFGH
    public String printNonRepeatingCharacter(String s);
    
    public boolean checkAnagram(String s1,String s2);  //==>  MANISH -> AMNISH  => 
    
    public boolean checkAnagramOfBinaryRepresentationAndItsComplement(int a);  // 8 -->  1000 2^0+2^1+2^2+2^3 -->  0111 --> 0111
                                                                               // 1000                                        // 1 =>   1000
    
    public boolean checkForPalindrome(String s1);   //123321  1234321
    
    public int [] convertStringToInteger(String s);  // 'ABCDE'-> 959697  //onetwothree --> 123
    
    public char removeGivenCharacterFromString(String s,char c);   //ABCDEF  = ABDEF
    
   // public int calculateHammingDistance(String s1, String s2);  // 101010  101011  1  // 10101 10000  //2   10000  11111  4
    
    public boolean checknDistanceApart(String s1,String s2,int difference);   //ABCDEF  BCEF //Edit//Add// 
                                                  //  BCDEF    ABCDEF   false  //add,removal 
    
//s1.lenghth+1=s2.length or s1.length=s2.length+1   
//    char [] arr= new char [256]; // ABC CBA
//    
//    +1        //  +1 -1     
//    -1
//    
//    //edit ->
//    
//    2 char //  +1 or -1 
            
    
    
 
}
