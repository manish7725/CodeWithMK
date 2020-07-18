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
        System.out.println(l.isEmpty());
        //l.addFirst(12);
        //l.addFirst(13);
        //l.addFirst(14);
        //l.addFirst(15);
        l.addFirst(11);
        l.addFirst(12);
        l.addFirst(13);
        //l.removeFirst();
        //l.removeFirst();
        //l.removeFirst();
        //l.removeFirst();
        //l.removeFirst();
        
        l.printAll();
    }
            
}
