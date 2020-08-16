/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.stack;

import java.util.Arrays;

/**
 *
 * @author 1576202
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
       // LinkedStack<Integer> stack=new LinkedStack<>();
       // stack.push(10);
       // stack.push(20);
       // stack.push(30);
       // stack.push(40);
       // stack.push(50);
        //stack.push(50);
        //System.out.println(Arrays.toString(stack.getData()));
       // System.out.println(stack.pop());
        //System.out.println(stack.pop());
        //System.out.println(stack.pop());
        //System.out.println(Arrays.toString(stack.getData()));
       // stack.top();
       // stack.pop();
        //stack.pop();
        //stack.pop();
        //System.out.println(Arrays.toString(stack.getData()));
        
//        boolean out=StackUtility.isMatching("()((()()()");
//        System.out.println(out);

        String exp = "A+B*C-D";
        System.out.println("Infix Expression: " + exp);
        System.out.println("Postfix Expression: " + StackUtility.infixToPostFix(exp));

    }
    
}
