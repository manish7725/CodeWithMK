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
    
    public void maximumOccuringCharacter(String s);
    
    public void removeDuplicate(String s);
    
    public void checkStringsAreRotaionOfOther(String s1,String s2);
    
    public void reverseString(String s);
    
    public void printNonRepeatingCharacter(String s);
    
    public boolean checkAnagram(String s1,String s2);
    
    public boolean checkForPalindrome(String s1);
    
    public int [] convertStringToInteger(String s);
    
    public char removeGivenCharacterFromString(String s,char c);
    
 
}
