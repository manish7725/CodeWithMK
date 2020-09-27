/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.tree;

import com.manish.position.Position;

/**
 *
 * @author 1576202
 */
public abstract class AbstractTree<E> implements Tree<E>{

    @Override
    public boolean isInternal(Position<E> p) throws IllegalArgumentException {
      return numChildren(p)>0;
    }

    @Override
    public boolean isExternal(Position<E> p) throws IllegalArgumentException {
      return numChildren(p)==0;
    }

    @Override
    public boolean isRoot(Position<E> p) throws IllegalArgumentException {
      return p==root();
    }

    @Override
    public boolean isEmpty() {
      return size()==0;
    }
    
    public int depth(Position<E> p){
    if(isRoot(p))
        return 0;
    else
       return 1+depth(parent(p));
    }
    
  
    public int hight(Position<E> p){
       int h=0;
       for(Position<E> c:children(p)){
         h=Math.max(h, 1+hight(c)); 
       }
       return h;
    }
    
    
}
