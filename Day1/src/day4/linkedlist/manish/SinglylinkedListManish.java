/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.linkedlist.manish;

/**
 *
 * @author 1576202
 */
public class SinglylinkedListManish<E> implements List<E>{
    
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

    public SinglylinkedListManish() {
    
    }

    @Override
    public boolean isEmpty() {
      return size==0;
    }

    @Override
    public int size() {
      return size;
    }

    @Override
    public E last() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E first() {
       if(isEmpty())
           return null;
       return head.getElement();
    }

    @Override
    public void addFirst(E e) {
       if(isEmpty()){ 
         head=new Node<>(e,null);
         tail=head;
       }else{
         head=new Node<>(e,head);
               
       }
       size++;
    }

    @Override
    public void addLast(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
