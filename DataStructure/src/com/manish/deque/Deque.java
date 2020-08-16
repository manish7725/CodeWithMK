/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.deque;

import com.manish.position.LinkedPositionalList;
import com.manish.position.Position;

/**
 *
 * @author 1576202
 */
public class Deque<E> implements DequeADT<E>{ 
    LinkedPositionalList<E> p;

    public Deque() {
        this.p = new LinkedPositionalList<>();
    }

    @Override
    public int size() {
      return p.size();
    }

    @Override
    public boolean isEmpty() {
      return p.isEmpty();
    }

    @Override
    public E getFront() {
      return p.first().getElement();
    }

    @Override
    public void addInFront(E e) {
      p.addBefore(p.header, e);
    }

    @Override
    public void removeFromFrond() {
      Position<E> c=p.after(p.header);
      p.remove(c);
    }

    @Override
    public void addInLast(E e) {
       p.addBefore(p.trailer, e);
    }

    @Override
    public void removeFromLast() {
      Position<E> c=p.before(p.trailer);
      p.remove(c);    
    }

    @Override
    public E getLast() {
     return p.before(p.trailer).getElement();
    }
    
    
    
}
