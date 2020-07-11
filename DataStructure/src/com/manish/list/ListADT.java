/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.list;

/**
 *
 * @author 1576202
 */
public interface ListADT<E> {
    
    public int size();
    public boolean isEmpty();
    public E get(int index) throws IndexOutOfBoundsException;
    public E set(int index,E element) throws IndexOutOfBoundsException;
    public void add(E element,int index) throws IndexOutOfBoundsException;
    public E remove(int index) throws IndexOutOfBoundsException;
    
    
    
    
    
}
