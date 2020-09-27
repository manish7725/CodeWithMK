/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.tree.wrongADT;

/**
 *
 * @author 1576202
 */
public class IdenticalBinaryTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode left=new TreeNode(20);
        TreeNode right=new TreeNode(30);
        TreeNode left_left=new TreeNode(40);
        TreeNode left_right=new TreeNode(50);
        TreeNode right_left=new TreeNode(60);
        TreeNode right_right=new TreeNode(70);
        
        root.left=left;
        root.right=right;
        left.left=left_left;
        left.right=left_right;
        right.left=right_left;
        right.right=right_right;  
        
        
        TreeNode root1=new TreeNode(10);
        TreeNode left1=new TreeNode(20);
        TreeNode right1=new TreeNode(30);
        TreeNode left_left1=new TreeNode(40);
        TreeNode left_right1=new TreeNode(50);
        TreeNode right_left1=new TreeNode(60);
        TreeNode right_right1=new TreeNode(70);
        
        root1.left=left1;
        root1.right=right1;
        left1.left=left_left1;
        left1.right=left_right1;
        right1.left=right_left1;
        right1.right=right_right1;  
        
        
       }
}
