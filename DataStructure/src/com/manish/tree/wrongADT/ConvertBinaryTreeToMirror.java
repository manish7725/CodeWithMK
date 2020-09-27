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
public class ConvertBinaryTreeToMirror {
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
        convertMirror(root);
        LevelOrderTraversal.printLevelOrderTraversal(root,LevelOrderTraversal.hight(root));
    }

    private static TreeNode convertMirror(TreeNode node) {
        if(node==null)
            return null;
        TreeNode temp=node.right;
        node.right=convertMirror(node.left);
       
        node.left=convertMirror(temp);
        return node;
    }

    
}
