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
    
    public boolean checkAnagram(String s1,String s2);
    
    public boolean checkAnagramOfBinaryRepresentationAndItsComplement(int a);
    
    public boolean checkForPalindrome(String s1);
    
    public int [] convertStringToInteger(String s);
    
    public char removeGivenCharacterFromString(String s,char c);
    
    public int calculateHammingDistance(String s1, String s2);
    
    public boolean checknDistanceApart(String s1,String s2,int k);
    
 
}
