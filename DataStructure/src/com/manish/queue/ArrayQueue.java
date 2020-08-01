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
public class ArrayQueue<E> {
    private  static final int CAPACITY=100;
    private E[] data;
    private int statIndex;
    private int noOfElemnetsInQueue;
   
     public ArrayQueue(){
      this(CAPACITY);
            }
    public ArrayQueue(int capacity){
       data=(E[]) new Object[capacity];
    }
    
    
}
