/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.tree.wrongADT;

import java.util.Stack;



/**
 *
 * @author 1576202
 */
public class TreeNodeDemo {
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
        print(root);
    }
    
    public static int height(TreeNode node){
       if(node==null)
           return 0;
       return 1+Math.max(height(node.left),height(node.right));
    }
    
    public static int sum(TreeNode node){
       if(node==null)
           return 0;
       int s1=sum(node.left);
       int s2=sum(node.right);
       int val=node.val;
       return val+s1+s2;
    
    }
    
    
    public static void print(TreeNode node){
        if(node==null){
          return;
        }else{
            print(node.left);
            print(node.right);
            System.out.println(node.val);
           
        }
    
    }
    
    
    
    
    public static void print2(TreeNode node){
     Stack<TreeNode> st=new Stack();
     TreeNode curent=node;
     while (curent != null || st.size() > 0) 
        { 
            while (curent !=  null) 
            { 
                st.push(curent); 
                curent = curent.left; 
            } 
            curent = st.pop(); 
            System.out.println(curent.val); 
            curent = curent.right; 
        } 
    }
    
    
     public static void print3(TreeNode node){
     Stack<TreeNode> st=new Stack();
     boolean flag=true;
     TreeNode curent=node;
     while (curent != null||st.size()>0 ) 
        {
            while(curent!=null){
                st.push(curent);
                curent=curent.left;
            }
            //flag=true
            if(flag==false && st.size()>0){
                System.out.println(st.pop().val);
                curent=st.pop();
            }
                
            if(st.size()>0 && st.peek()!=null ){
                curent=st.peek();
                if(curent.right!=null){
                   curent=curent.right;
                   st.pop();
                   flag=false;
                   //st.push(curent);
                }else{
                    System.out.println(curent.val);
                    curent=null;
                    st.pop();
                }
            }
            
        
        
        }
     
    }
    
}
