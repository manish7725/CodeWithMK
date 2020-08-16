/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.stack;

/**
 *
 * @author 1576202
 */
public class StackUtility {
    
    public static boolean isMatching(String expression){
        char opening='(';
        char closing=')';
        LinkedStack<Character> buffer=new LinkedStack<>();
        for(char c: expression.toCharArray()){
         if(c==opening){
           buffer.push(c);
         }else if(c==closing){
           if(buffer.isEmpty())
               return false;
           else
               buffer.pop();
         }
        
        }
        
     return buffer.isEmpty();
    }


   private static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
   
   
    static String infixToPostFix(String expression){

        String result = "";
        Stack<Character> stack = new LinkedStack<>();
        
        for(char c:expression.toCharArray()){
           if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.top())>=precedence(c)){
                    result += stack.pop();
                }
                stack.push(c);
           }else
           {
             result+=c;
           }
        
        }
        
        for (int i = 0; i <=stack.size() ; i++) {
            result += stack.pop();
        }
        
        return result;
        
        
//        for (int i = 0; i <expression.length() ; i++) {
//            char c = expression.charAt(i);
//
//            //check if char is operator
//            if(precedence(c)>0){
//                while(stack.isEmpty()==false && precedence(stack.top())>=precedence(c)){
//                    result += stack.pop();
//                }
//                stack.push(c);
//            
//            }else{
//                //character is neither operator nor ( 
//                result += c;
//            }
//        }
//        for (int i = 0; i <=stack.size() ; i++) {
//            result += stack.pop();
//        }
//        return result;
    }
}
