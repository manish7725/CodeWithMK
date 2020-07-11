/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.linkedlist.manish;

import day1.array.manish.ArrayList;

/**
 *
 * @author 1576202
 * @param <E>
 */
public class SinglyLinkedList<E> implements List<E>{
    private static class Node<E>{
      private final E element;
      private Node<E> next;
      
      
      
      public Node(E e,Node<E> n){
       element=e;
       next=n;
      }
      public E getElement(){return element;}
      public Node<E> getNext(){return next;}
      public void setNext(Node<E> n){
      next=n;
      } 
    }
    
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

    public SinglyLinkedList() {
    
    }
    
    @Override
    public boolean isEmpty(){return size==0;};
    @Override
    public int size(){return size;}
    
    @Override
    public E first(){
    if(isEmpty()) return null;
    return head.getElement();
    }
    
    @Override
    public E last(){
    if(isEmpty()) return null;
    return tail.getElement();
    }
    
    @Override
    public void addFirst(E e){
    head=new Node<>(e,head);
    if(isEmpty())
        tail=head;
    size++;
    }
    
    @Override
    public void addLast(E e){
    Node<E> newest=new Node<>(e,null);
    if(isEmpty())
        head=newest;
    else
        tail.setNext(newest);
    
    
    tail=newest;
    size++;
    }
    
    @Override
    public E removeFirst(){
    
    if(isEmpty()) return null;
    E answer=head.getElement();
    head=head.getNext();
    size--;
    if(size==0)
        tail=null;
    return answer;
   }
    
    public void printAll(){
    Node<E> temp=head;
    while(temp!=null){
        System.out.print(temp.element+"\t");
        temp=temp.next;
    }
    }
    
    
    
    
    
}
