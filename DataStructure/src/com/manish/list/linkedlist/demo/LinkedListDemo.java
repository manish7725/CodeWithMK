/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.list.linkedlist.demo;

import com.manish.list.linkedlist.LinkedList;

/**
 *
 * @author 1576202
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        
       l.addFirst(1);
       l.addFirst(2);
       l.addFirst(3); 
       l.addFirst(4);
       l.addFirst(5);
       l.addFirst(6);
       
       l.printAll();
       
       l.deleteNnodesAfterMnodes(3, 2);
       System.out.println("After Reversal");
       l.printAll();
       
    }
            
}
