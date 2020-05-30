///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package day2.string.manish;
//
///**
// *
// * @author 1576202
// */
//public class Rotation {
//    public static void checkStringsAreRotaionOfOther(String s1, String s2) {
//	        if(s1.length()!=s2.length())return ;
//	        System.out.println(checkStringsAreRotaionOfOtherUtil(s1,0,s2));
//	    }
//	    
//	    private static boolean checkStringsAreRotaionOfOtherUtil(String s1,int idx, String s2) {
//	        if(idx>=s1.length())return false;
//	        String sub1 = s1.substring(idx);
//	        String sub2 = s2.substring(0,s2.length()-idx);
//	        
//	        if(sub1.equals(sub2)){
//	        	String 
////
//if(sub1.equals(sub2)){
//	        	String sub3 = s1.substring(0,idx);
//		        String sub4 = s2.substring(idx+1);
//		        if(sub3.equals(sub4))return true ;
//		        return false;
//	        }
//	        return checkStringsAreRotaionOfOtherUtil(s1,idx+1,s2);}
//    
//}
//}