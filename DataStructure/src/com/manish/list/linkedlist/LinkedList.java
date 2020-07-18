/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.list.linkedlist;

import com.manish.list.ListADT2;

/**
 *
 * @author 1576202
 */
public class LinkedList<E> implements ListADT2<E>{
    
    public static class Node<E>{
        E data;
        Node<E> next;

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
        
        
    }

    private int size=0;
    public Node<E> head=null;
    public Node<E> tail=null;
    
    
    
    @Override
    
    
    
    public boolean isEmpty() {
       return size==0;
    }

    public LinkedList() {
    }



    @Override
    public int size() {
       return size;
    }

    @Override
    public E last() {
        return tail.getData();
    }

    @Override
    public E first() {
        return head.getData();
    }

    @Override
    public void addFirst(E e) {
       head=new Node<>(e,head);
       if(isEmpty()){
       tail=head;
       }
       size++;
    }

    @Override
    public void addLast(E e) {
     Node<E> newNode=new Node<>(e,null);
     if(isEmpty()){
     head=newNode;
     }else{
     tail.setNext(newNode);
     }
     tail=newNode;
     size++;
    }

    @Override
    public E removeFirst() throws IllegalArgumentException {
      E temp;
      if(isEmpty())
          throw new IllegalArgumentException("LinedList is empty");
      else{
         temp=head.getData();
         head=head.next;
         size--;
       }
      if(size==0)
        tail=null;
      return temp;
    }

    @Override
    public void printAll() {
      Node<E> temp=head;
      while(temp!=null){
          System.out.println(temp.getData());
          temp=temp.next;
      }
      //System.out.println(tail.getData());
    }
    
    public void addAfterElement(E e) throws IllegalArgumentException{
        Node<E> temp=head;
        Node<E> newNode=new Node<>(e,null);
        while(temp.data!=e){
         temp=temp.next;
        }
        if(temp==null){
          throw new IllegalArgumentException();
        }else{
          newNode.setNext(temp.getNext());
          temp.setNext(newNode);
        }
     
    }
    
    public void removeLast(){
       
    }
    
}
