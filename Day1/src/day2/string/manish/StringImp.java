///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package day2.string.manish;
//
//import java.awt.BorderLayout;
//import java.util.Arrays;
//
///**
// *
// * @author 1576202
// */
//public class StringImp implements StringADT{
//
//    @Override
//    public void printEachCharacterInString(String s) {
//        int point=0;
//        for(int i=0;i<s.length();i++){
//            point =s.charAt(i);
//        }
//         byte [] byteCode=s.getBytes();
//         
////         for(int i=0;i<s.length();i++){
////             System.out.println(byteCode[i]);
////         }
//        
//
//    }
//
//    void printEachCharacterInString(char[] s2) {
//        for (int i = 0; i < s2.length; i++) {
//            System.out.print(s2[i]);
//            
//        }
//       
//    }
//
//    @Override
//    public int maximumOccuringCharacter(String s) {
//       int [] charCount=new int [256]; ///   AABCCCD
//       //  ,0, 0, 0, 0,                       ,2,1,3    
//       
//       int maxIndex=0;  //67
//       for(int i=0;i<s.length();i++){
//          char c=s.charAt(i);
//          charCount[c]+=1;
//          if(charCount[maxIndex]<charCount[c]){
//           maxIndex=c;
//          }
//       }
//       return maxIndex;
//    }
//
//    @Override
//    public String removeDuplicate(char [] charArray){
//     int index=0;   
//    
//        for (int i = 0; i < charArray.length; i++) {
//            int j;                                    //AABCCDDE
//            for(j=0;j<=i;j++){                       //i=2 j =0,1,2  i=4
//             if(charArray[i]==charArray[j]){         // i=1 j=0     
//               break;
//             }
//            }
//          if(i==j){  
//          charArray[index]=charArray[i];  
//          index++;   
//              System.out.println(Arrays.toString(charArray));//ABcDE DDE
//          }    
//        }
//        return new String(charArray, 0, index);
//
//    }
//   // MANISH   ANISHM
//    @Override
//    public boolean checkStringsAreRotaionOfOther(String s1, String s2) {
//      char [] charArray=new char[256]; // o[1]   Space Complexity
//      if(s1.length()!=s2.length())
//      return false;
//      else {
//           char c=s2.charAt(0);
//           int index=0;
//           for(int i=0;i<s1.length();i++){
//            if(s1.charAt(i)==c) {
//            
//            }
//           } 
//      return false;
//      }
//    }
//
//
//    @Override
//    public String reverseString(String s) {
//      char [] charArray=s.toCharArray();
//       reverseString(charArray,0);
//       return Arrays.toString(charArray);
//    }
//    
//     private void reverseString(char[] charArray, int i) {
//       if(i==charArray.length/2){
//       return;
//       }else{
//       swap(charArray,i,charArray.length-1-i); 
//       reverseString(charArray,i+1);
//       } 
//     }
//     
//     
//    private void swap(char[] charArray, int i, int i0) {
//     char c=charArray[i];
//     charArray[i]=charArray[i0];
//     charArray[i0]=c;
//    }
//    
//    @Override
//    public String printNonRepeatingCharacter(String s) {
//      char [] charArray=new char[256]; // o[1]   Space Complexity
//      StringBuffer sb=new StringBuffer();
//       for(int i=0;i<s.length();i++){   //MMAANISH
//        charArray[s.charAt(i)]+=1;     //M--> 95  charArray[95] 2    
//       }     //o(s.length())
//       for(int i=0;i<charArray.length;i++){   // O(c)
//       if(charArray[i]==1){
//       sb.append((char)i);
//       }
//       }
//        //System.out.println(sb);
//   return sb.toString();
//
//    }
//
//    @Override
//    public boolean checkAnagram(String s1, String s2) {
//       char [] charArray=new char[2];
//       if(s1.length()!=s2.length()){
//       return false;
//       }else {
//        for(int i=0;i<s1.length();i++){
//        charArray[s1.charAt(i)]+=1;
//        charArray[s2.charAt(i)]-=1;
//        }
//        
//        for(int i=0;i<charArray.length;i++){
//        if(charArray[i]==1)
//            return false;
//        }
//        return true;
//       }
//       
//
//    }
//
//    @Override
//    public boolean checkForPalindrome(String s1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public int[] convertStringToInteger(String s) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public char removeGivenCharacterFromString(String s, char c) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean checkAnagramOfBinaryRepresentationAndItsComplement(int a) {
//      String s=Integer.toBinaryString(a);
//      String s2=calculateTwoComplement(s);
//        System.out.println("s1 : "+s+"  s2  : "+s2);
//    return checkAnagram(s, s2);
//    }
//    
//    private String calculateTwoComplement(String s) {
//      int carry=1;
//      char twoCharArray[]=new char[s.length()+1];  //1000  -->         //  01111  ->     00111
//      for(int i=s.length()-1;i>=0;i--){
//        twoCharArray[i+1]=(s.charAt(i) == '0') ? '1' : '0';   //  
//        System.out.println(Arrays.toString(twoCharArray));    
//      }
//      twoCharArray[0]='0';
//      
//   
//      for (int i=twoCharArray.length-2;i>=0;i--){
//        if(twoCharArray[i+1]=='1' && carry==1){
//            twoCharArray[i+1]='0';
//            carry=1;
//        }else if(twoCharArray[i+1]=='0' && carry==1){
//            twoCharArray[i+1]='1';
//            carry=0;
//        } else if(twoCharArray[i+1]=='1' && carry==0){
//           twoCharArray[i+1]='1';
//           carry=0;
//        } else if (twoCharArray[i+1]=='0' && carry==0){
//          twoCharArray[i+1]='0';
////          carry=0;
//        } else {
//            System.out.println("Some invalid combination");
//        }
//      }
//      if (carry==1){
//         twoCharArray[0]='1';
//         //System.out.println(Arrays.toString(twoCharArray));
//         return Arrays.toString(twoCharArray);
//      }else {
//         twoCharArray[0]='0';
//         String output1=Arrays.toString(twoCharArray);
//          //System.out.println(output.substring(1));
//         return output1.substring(3);
//        
//      }
//      
//
//    }
//
//    @Override
//    public int calculateHammingDistance(String s1, String s2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean checknDistanceApart(String s1, String s2, int k) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    
//
//   
//
//   
//    
//}
