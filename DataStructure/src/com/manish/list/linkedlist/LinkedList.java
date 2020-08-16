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
    
    private static class Node<E>{
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
          System.out.print(temp.getData()+"\t");
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
    
    
    public E removeLast() {

        if (isEmpty()) {
            throw new IllegalArgumentException("No element to be removed");
        }
        E answer = tail.getData();
        
            Node<E> temp = head;
            while (temp.next!=null &&temp.next != tail) {
                temp = temp.next;
            }
            temp.setNext(null);
            tail = temp;
            size--;
            if(size==0)
             head=null;
        
        return answer;
    }
    
    public void getMiddleElement() throws IllegalArgumentException{
    int count=0;
    int middle=0;
    boolean evenflag;
    
    Node<E> temp=head;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
     System.out.println("Count"+count);
     if(count==0){
        throw new IllegalArgumentException("Size is zero");    
     }
     
     if(count%2==0){
        evenflag=true;
        middle=count/2;
     }else{
        middle=count/2;
        evenflag=false;
     }
     temp=head;
     count=0;
     
     while(temp!=null){
         
        if(middle==(count+1) && evenflag==true){
             System.out.println(temp.getData() +" " +temp.next.getData());
             return;
        }else if(middle==(count+1) && evenflag==false){
             System.out.println(temp.next.getData());
             return;
        }
        temp=temp.next;
        count++;
    }
    
   }
    
    public void deleteMiddleElement(){
    Node<E> slowRunner=head;
    Node<E> fastRunner=head;
    Node<E> prev=null;
    while(fastRunner!=null &&fastRunner.next!=null &&fastRunner.next.next!=null){
      prev=slowRunner;
      slowRunner=slowRunner.next;
      fastRunner=fastRunner.next.next;
    }
    
   if(prev!=null){
      prev.next = slowRunner.next;
   }
    
    }
    
//    public void detectLoop(){
//    
//    }
    
    public void reverseList(){
       Node<E> current=head;
       Node<E> prev=null;
       Node<E> temp=null;
       while(current!=null){
           temp=current;
           current=current.next;
           temp.next=prev;
           prev=temp;
      }
       head=prev;
       
        
        
    
    }
    
    public void deleteNnodesAfterMnodes(int n,int m){
       Node<E> temp=head;
       int countM=0;
       int countN=0;
       while(temp!=null && temp.next!=null&&countM!=m-1){
           countM++;
           temp=temp.next;
       }
        //System.out.println("Temp="+temp.data + "  And count="+countM);
       if(temp!=null){
      Node<E> deleteTemp=temp.next;
       while(deleteTemp!=null && countN!=n){
           deleteTemp=deleteTemp.next;
           countN++;
       }
       
       //System.out.println("deleteTemp="+deleteTemp.data + "  And count="+countN);
       if(deleteTemp!=null)
         temp.next=deleteTemp;
       else
         temp.next=null;
       }
       
       
       
        
    
    }
    
    
    
    public void deleteNnodeFromBegining(int n){
    
    }
//    public void roatateCounterClockWiseByNelement(){
//    
//    
//    }
    
    public void mergeLinkedListAtAlternatePosition(){
    
    }
    
    public void findNthNodeFromEnd(int n){
    
    }
    
    public void checkLinkedListIsPalindrome(){
    
    
    
    }
}
