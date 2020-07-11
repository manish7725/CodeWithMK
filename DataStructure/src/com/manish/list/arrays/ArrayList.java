/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.list.arrays;

import com.manish.list.ListADT;

/**
 *
 * @author 1576202
 */
public class ArrayList<E> implements ListADT<E>{

    public static final int CAPACITY=16;
    private E[] data;
    private int size=0;

    public ArrayList() {
        this(CAPACITY);
    }
     public ArrayList(int capacity) {
        data=(E[]) new Object[capacity];
    }
     
     
    
    
    @Override
    public int size() {
       return size;
    }

    @Override
    public boolean isEmpty() {
      return size()==0;
    }
    
    private void checkIndex(int i,int n) throws IndexOutOfBoundsException{
    if(i<0 |i>=n)
        throw new IndexOutOfBoundsException("Index is wrong");
    } 

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        checkIndex(index, size);
        return data[index];
    }

    @Override
    public E set(int index, E element) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(E element, int index) throws IndexOutOfBoundsException {
      checkIndex(index,size+1);
      if(size==data.length)
           throw new IllegalStateException("Array is full");
           //resize(2*data.length);
      for(int k=size-1;k>=index;k--){
        data[k+1]=data[k];
      }
      data[index]=element;
      size++;
              
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
      checkIndex(index,size);
      E element=data[index];
      for(int k=index;k<size;k++){
        data[k]=data[k+1];
      }
      data[size-1]=null;//garbage collection
      size--;
      return element;
    }
    
    private void resize(int capacity){
    E [] temp=(E[])new Object[capacity];
    for(int k=0;k<size;k++){
        temp[k]=data[k];
    }
    data=temp;
    }
    
   
    
    
}
