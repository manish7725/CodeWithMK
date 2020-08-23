/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.list.arrays;

import com.manish.list.ListADT;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author 1576202
 */
public class ArrayList<E> implements ListADT<E>{
    private E[] data; 
    private int size=0;
    private final static int CAPACITY=4;

    public ArrayList(int capacity) {
        data=(E[]) new Object[capacity];
    }

    public ArrayList() {
        this(CAPACITY);
    }
    
    
    
    
    

    @Override
    public int size() {
      return size;
    }

    @Override
    public boolean isEmpty() {
     return size==0;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
      checkIndex(index,size);
      return data[index];
    }

    @Override
    public E set(int index, E element) throws IndexOutOfBoundsException {
        checkIndex(index, size);
        E temp=data[index];
        data[index]=element;
        return temp;
    }

    @Override
    public void add(E element, int index) throws IndexOutOfBoundsException {
     checkIndex(index, size+1);
     
      if(size==data.length)
           //throw new IllegalStateException("Array is full");
           resize(5*data.length);
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

    @Override
    public void add(E element) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void checkIndex(int index, int size) throws IndexOutOfBoundsException{
       if(index<0|index>=size)
           throw new IndexOutOfBoundsException("Please provide correct index");
    }

//    @Override
//    public String toString() {
//        StringBuilder sb=new StringBuilder();
//        sb.append("[");
//        for(int i=0;i<size;i++){
//            sb.append(data[i]+",");
//        }
//        //sb.deleteCharAt(sb)
//        sb.append("]");
//     return sb.toString();
//    }

    @Override
    public String toString() {
        return "ArrayList{" + "data=" + Arrays.toString(data) + '}';
    }

    private void resize(int capacity) {
      E [] temp=(E [])new Object[capacity];
      
      for(int i=0;i<size;i++){
      temp[i]=data[i];
      }
      data=temp;

    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     
  
}
