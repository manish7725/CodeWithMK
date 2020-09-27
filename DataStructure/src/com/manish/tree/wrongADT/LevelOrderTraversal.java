/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.tree.wrongADT;

import java.awt.BorderLayout;



/**
 *
 * @author 1576202
 */
public class LevelOrderTraversal {
    private static int count=1;
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
        //printLevel(root,4);  
        //System.out.println(hight(root));
        printLevelOrderTraversal(root,hight(root));
        
        //printLevelOrderTraversal(root);
    }

    public static void printLevel(TreeNode node, int level) {
      if(node==null)
          return;
      if(level==1 && count==1){
            System.out.print(node.val+"\t");
            count--;
            return;
      }  
      
      //System.out.print(node.val+"\t");
      printLevel(node.left,level-1);
      printLevel(node.right,level-1);
    }
    
//    private static void printLevelOrderTraversal(TreeNode node) {
//      int h=hight(node);
//      for(int i=1;i<=h;i++){
//       printLevel(node,i);
//       System.out.println("");
//      }
//    }
//    
//    private static void printLevelOrderTraversal(TreeNode node) {
//      int h=hight(node);
//      print(node,h);
//    }
    public static void printLevelOrderTraversal(TreeNode node,int h) {
      if(h==0)
          return;
      printLevelOrderTraversal(node,h-1);
      printLevel(node,h);
      System.out.println("");
    }
    
    public static int hight(TreeNode node){
      if (node==null)
        return 0;
      return 1+ Math.max(hight(node.left),hight(node.right));
    }
    
      
    
}
