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
public class LinkedPositionalList<E> implements PositionalList<E>{

    
    private static class Node<E> implements Position<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
        
        
        @Override
        public E getElement() throws IllegalStateException {
            if(next==null)
               throw new IllegalStateException("Position is not valid"); //To change body of generated methods, choose Tools | Templates.
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" + "element=" + element + '}';
        }

//        @Override
//        public E getElement() throws IllegalStateException {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
        
        
    
    }
    public  Node<E> header;
    public Node<E> trailer;
    private int size=0;

    public LinkedPositionalList() {
        header=new Node<>(null,null,null);
        trailer=new Node<>(null,header,null);
        header.setNext(trailer);
    }
    
    private Node<E> validate(Position<E> p) throws IllegalArgumentException{
    if(!(p instanceof Node)) throw new IllegalArgumentException("Invalid Position");
    Node<E> node=(Node)p;
    if(node.getNext()==null)
        throw new IllegalArgumentException("P is no longer in the list");
    return node;
    }
    
    
    private Position<E> addBetween(E e,Node<E> prev,Node<E> next){
      Node<E> newest=new Node<>(e,prev,next);
      prev.setNext(newest);
      next.setPrev(newest);
      size++;
      return newest;
    }
    
    @Override
    public int size() {
        return size;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return size==0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position<E> first() {
       if(size>0)
           return header.next;
       return null;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position<E> last() {
       if(size>0)
           return trailer.prev;
       else
           return null;
    }

    @Override
    public Position<E> before(Position<E> p) throws IllegalArgumentException {
        Node<E> n=validate(p);
        return (Position<E>)n.getPrev();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position<E> after(Position<E> p) throws IllegalArgumentException {
      Node<E> n=validate(p);
      return n.getNext();
    }

    @Override
    public Position<E> addFirst(E e) {
       //Node n=vlaidate(p);
        return addBetween(e, header, header.next);
    }
    
    @Override
    public Position<E> addLast(E e) {
        return addBetween(e, trailer.prev, trailer);
    }

    @Override
    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
     Node<E> n=validate(p);
       return  addBetween(e, n.prev, n);
    }

    @Override
    public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
      Node<E> n=validate(p);
       return  addBetween(e, n, n.next);
    }

    @Override
    public E set(Position<E> p, E e) throws IllegalArgumentException {
      Node<E> n=validate(p);
      E answer=n.getElement();
      n.setElement(e);
      return answer;
    }

    @Override
    public E remove(Position<E> p) throws IllegalArgumentException {
      Node<E> node=validate(p);
      Node<E> predecessor=node.getPrev();
      Node<E> successor=node.getNext();
      predecessor.setNext(successor);
      successor.setPrev(predecessor);
      E answer=node.getElement();
      size--;
      node.setNext(null);
      node.setNext(null);
      return answer;
    }
 
    
   
    
}
