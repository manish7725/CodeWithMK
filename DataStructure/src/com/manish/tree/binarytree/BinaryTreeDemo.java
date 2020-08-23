/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.tree.binarytree;

import com.manish.position.Position;

/**
 *
 * @author 1576202
 */
public class BinaryTreeDemo {
    public static void main(String args[]){
        LinkedBinaryTree<Integer> t=new LinkedBinaryTree<>();
        Position<Integer> p=t.addRoot(10);
        Position<Integer> left= t.addLeft(p, 20);
        Position<Integer> right =t.addRight(p, 30);
        
        System.out.println(t.root.getRight().getElement());
    }
    
}
