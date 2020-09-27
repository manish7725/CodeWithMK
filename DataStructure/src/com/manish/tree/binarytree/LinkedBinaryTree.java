/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.tree.binarytree;

import com.manish.position.Position;
import java.util.Iterator;

/**
 *
 * @author 1576202
 */
public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

    
    protected static class Node<E> implements Position<E>{
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
        
        
        @Override
        public E getElement() throws IllegalStateException {
          return element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }

        public void setElement(E element) {
            this.element = element;
        }
        
        
    
    }
    
    
    
    
    protected Node<E> createNode(E e,Node<E> parent,Node<E> left,Node<E> right){
      return new Node(e,parent,left,right);
    }
    
    protected Node<E> root =null;
    private int size=0;
    
    public LinkedBinaryTree(){}
    
    
    
    @Override
    public Position<E> left(Position<E> p) throws IllegalArgumentException {
     Node<E> node=validate(p);
     return node.getLeft();
     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position<E> right(Position<E> p) throws IllegalArgumentException {
       Node<E> node=validate(p);
       return node.getRight();    
    }

    @Override
    public Position<E> root() {
      return root;
    }

    @Override
    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
      Node<E> node=validate(p);
      return node.getParent();
    }

    @Override
    public int size() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Position<E>> positions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    protected Node<E> validate(Position<E> p) throws IllegalArgumentException{
    if(!(p instanceof Node) ) throw new IllegalArgumentException("Not Valid Position Type");
    
    Node<E> node=(Node<E>)p;
    
    if(node.getParent()==node)
        throw new IllegalArgumentException("Position is not part of tree");
    
    return node;
    
    }
    
    
    public Position<E> addRoot(E e){
      if(!isEmpty()) throw new IllegalStateException("Tree is not empty");
      root=createNode(e, null, null, null);
      size=1;
      return root;
    }
    
    public Position<E> addLeft(Position<E> p,E e){
    Node<E> parent=validate(p);
    if(parent.getLeft()!=null)
        throw new IllegalArgumentException("Left is not empty");
    
    Node<E> child=createNode(e, parent, null, null);
    parent.setLeft(child);
    size++;
    return child;
    
    }
    
    public Position<E> addRight(Position<E> p,E e){
    Node<E> parent=validate(p);
    if(parent.getRight()!=null)
        throw new IllegalArgumentException("Left is not empty");
    
    Node<E> child=createNode(e, parent, null, null);
    parent.setRight(child);
    size++;
    return child;
    
    }
    
    public E remove(Position<E> p) throws IllegalArgumentException{
    Node<E> node=validate(p);
    if(numChildren(p)==2)
         throw new IllegalArgumentException("Given node has 2 children");
    Node<E> child=(node.getLeft()!=null?node.getLeft():node.getRight());
    if(child!=null)
        child.setParent(node.getParent());
    if(node==root)
        root=child;
    else{
       Node<E> parent=node.getParent();
       if(node==parent.getLeft())
           parent.setLeft(child);
       else
           parent.setRight(child);
    }
    size--;
    E temp=node.getElement();
    node.setElement(null);
    node.setLeft(null);
    node.setRight(null);
    node.setParent(node);
    return temp;
    
    }

    @Override
    public String toString() {
        return "LinkedBinaryTree{" + "size=" + size + '}';
    }
     
    public void printTree(Position<E> p,String space){
        space=space+" ";
        if(p==null) return;
        else{
        Node<E> node=validate(p);
        System.out.println(space+node.getElement());
        printTree(node.getLeft(),space);
        printTree(node.getRight(),space);
        }
    
    }
    
    
    
}
