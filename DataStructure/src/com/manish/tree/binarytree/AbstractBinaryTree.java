/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.tree.binarytree;

import com.manish.list.ListADT;
import com.manish.list.arrays.ArrayList;
import com.manish.position.Position;
import com.manish.tree.AbstractTree;

/**
 *
 * @author 1576202
 */
public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {

    @Override
    public Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException {
       ListADT<Position<E>> snapshot=new ArrayList<>(2);
       if(left(p)!=null)
         snapshot.add(left(p));
        if(right(p)!=null)
            snapshot.add(right(p));
        
        return snapshot;
    }
    @Override
    public int numChildren(Position<E> p) throws IllegalArgumentException {
      int count=0;
      if(left(p)!=null)
       count++;
      
      if(right(p)!=null)
       count++;
      
      return count;
    }

    @Override
    public Position<E> sibling(Position<E> p) throws IllegalArgumentException {
     Position<E> parent=parent(p);
     if(parent==null) return null;
     if(p==left(parent))
         return right(parent);
     else
         return left(parent);
    }
   
    
}
