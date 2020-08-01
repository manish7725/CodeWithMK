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
public class ArrayStack<E>  implements Stack<E>{
    private static final int CAPACITY=100;
    private E [] data;
    private int topIndex=-1;

//    public E[] getData() {
//        return data;
//    }
    
    public ArrayStack(){
      this(CAPACITY);
            }
    public ArrayStack(int capacity){
       data=(E[]) new Object[capacity];
    }
    
    @Override
    public boolean isEmpty() {
      return topIndex==-1;
    }

    @Override
    public int size() {
      return topIndex+1;
    }

    @Override
    public void push(E e) {
     if(size()==data.length) throw new IllegalStateException("Stack is full");
     data[++topIndex]=e; 
    }

    @Override
    public E pop() {
    if(topIndex==-1) return null;
    E answer=data[topIndex];
    data[topIndex]=null;
    topIndex--;
    return answer;
    }

    @Override
    public E top() {
    if(isEmpty()) return null;
    return data[topIndex];
    }
    
}
