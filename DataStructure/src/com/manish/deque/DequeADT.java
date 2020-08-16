/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.deque;

/**
 *
 * @author 1576202
 */
public interface DequeADT<E> {
    int size();
    boolean isEmpty();
    E getFront();
    void addInFront(E e);
    void removeFromFrond();
    void addInLast(E e);
    void removeFromLast();
    E getLast();
    
    
}
