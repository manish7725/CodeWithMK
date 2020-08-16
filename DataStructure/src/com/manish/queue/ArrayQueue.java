/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.queue;

/**
 *
 * @author 1576202
 */
public class ArrayQueue<E> implements Queue<E> {
    private  static final int CAPACITY=100;
    private E[] data;

    public E[] getData() {
        return data;
    }
    private int startIndex;
    private int noOfElemnetsInQueue;
   
    
    
     public ArrayQueue(){
      this(CAPACITY);
            }
    public ArrayQueue(int capacity){
       data=(E[]) new Object[capacity];
    }

    @Override
    public int size() {
     return noOfElemnetsInQueue;
    }

    @Override
    public boolean isEmpty() {
      return noOfElemnetsInQueue==0;
    }

    @Override
    public void enquue(E e) {
        if(noOfElemnetsInQueue==data.length) throw new IllegalStateException("overflow");
        int avail=(startIndex+noOfElemnetsInQueue)%data.length;
        data[avail]=e;
        noOfElemnetsInQueue++;
    }

    @Override
    public E dequeue() {
       if(noOfElemnetsInQueue==0) return null;
       E answer=data[startIndex];
       data[startIndex]=null;
       startIndex=(startIndex+1)%data.length;
       noOfElemnetsInQueue--;
       return answer;
    }

    @Override
    public E first() {
    if(isEmpty())
        return null;
    return data[startIndex];
          
    }
    
    
    
}
