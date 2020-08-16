/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.position;

import java.awt.BorderLayout;

/**
 *
 * @author 1576202
 */
public class LinkedPositionalListDemo {
    public static void main(String args []){
       LinkedPositionalList<Integer> a=new LinkedPositionalList<>();
       a.addFirst(10);
       a.addFirst(20);
       Position<Integer> p;
       p=a.first();
       System.out.println(p.getElement());
       System.out.println(a.after(p));
    }
}
