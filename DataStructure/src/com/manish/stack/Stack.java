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
public interface Stack<E> {
    boolean isEmpty();
    int size();
    void push( E e);
    E pop();
    E top();
    
}
