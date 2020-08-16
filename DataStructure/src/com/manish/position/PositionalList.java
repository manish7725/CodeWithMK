/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.position;

/**
 *
 * @author 1576202
 */
public interface PositionalList<E> {
    int size();
    boolean isEmpty();
    Position<E> first();
    Position<E> last();
    Position<E> before(Position<E> p) throws IllegalArgumentException;
    Position<E> after(Position<E> p) throws IllegalArgumentException;
    Position<E> addFirst(E e);
    Position<E> addLast(E e );
    Position<E> addBefore(Position <E> p, E e) throws IllegalArgumentException;
    Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
    E set(Position<E> p,E e) throws IllegalArgumentException;
    E remove(Position<E> p) throws IllegalArgumentException;
    
}
