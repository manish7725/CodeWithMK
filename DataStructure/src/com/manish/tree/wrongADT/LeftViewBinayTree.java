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
public class LeftViewBinayTree {
    
    static int max_level=0;
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
        leftView(root,1);
    }

    private static void leftView(TreeNode node, int level) {
        if(node==null)
            return;
        if(max_level<level){
            System.out.println(node.val);
            max_level=level;
        }
        leftView(node.right, level+1);
        leftView(node.left,  level+1);
     }
}
