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
public class StringImp implements StringADT{

    @Override
    public void printEachCharacterInString(java.lang.String s) {
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }

    }

    void printEachCharacterInString(char[] s2) {
        for (int i = 0; i < s2.length; i++) {
            System.out.print(s2[i]);
            
        }
       
    }

    @Override
    public void maximumOccuringCharacter(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeDuplicate(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkStringsAreRotaionOfOther(String s1, String s2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reverseString(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printNonRepeatingCharacter(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkAnagram(String s1, String s2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkForPalindrome(String s1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] convertStringToInteger(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char removeGivenCharacterFromString(String s, char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
