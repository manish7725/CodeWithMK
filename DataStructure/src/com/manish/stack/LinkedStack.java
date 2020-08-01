/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.stack;

import com.manish.list.linkedlist.LinkedList;

/**
 *
 * @author 1576202
 */
public class LinkedStack<E> implements Stack<E>{
    private  LinkedList<E> list=new LinkedList<E>();

    @Override
    public boolean isEmpty() {
      return list.isEmpty();
    }

    @Override
    public int size() {
      return list.size();
    }

    @Override
    public void push(E e) {
      list.addFirst(e);
    }

    @Override
    public E pop() {
      E answer =list.removeFirst();
      return answer;
    }

    @Override
    public E top() {
      return list.first();
    }
    
    
    
}
