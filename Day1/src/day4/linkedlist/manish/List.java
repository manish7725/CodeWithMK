/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.linkedlist.manish;

/**
 *
 * @author 1576202
 * @param <E>
 */
public interface List<E> {
    public boolean isEmpty();
    public  int size();
    public E last();
    public E first();
    public void addFirst(E e);
    public void addLast(E e);
    public E removeFirst();
    public void printAll();
    
}
