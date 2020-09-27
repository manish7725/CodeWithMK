/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.tree.wrongADT;

import static com.manish.tree.wrongADT.TreeNodeDemo.print;

/**
 *
 * @author 1576202
 */
public class TreeNodeDemo2 {
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
        levelPrint(root, 3);
    }
    
    public static int getEvenOddLevelDifference(TreeNode node){
    if(node==null)
        return 0;
    return  node.val-getEvenOddLevelDifference(node.left)
            -getEvenOddLevelDifference(node.right);
    }
    
    public static int count(TreeNode node){
      if(node==null)
          return 0;
      if(node.left==null && node.right==null)
          return 1;
      int x=  count(node.left);
      int y=  count(node.right);
      
      return 0+x+y;
    
    }
    
    
     public static int count2(TreeNode node,TreeNode root){
      
      if(node==null) return 0;
      //if(node.left!=null||node.right!=null) return 1;
      int x=  count2(node.left,root);
      int y=  count2(node.right,root);
      if((node!=root)&&(node.left!=null ||node.right!=null)){
        return 1+x+y;
      }else if(node==root){
        return x+y;
      }else{ 
          return x+y;
      }
      
    }
     
     public static void levelPrint(TreeNode node,int level){
     
      if(node==null) return ;   
      
      if(level==1){
         System.out.println(node.val);
         return;
      }
      
      levelPrint(node.left,level-1);  
      levelPrint(node.right,level-1);  
      
          
     }
    
}
