/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.list.arrays;

import java.awt.BorderLayout;

/**
 *
 * @author 1576202
 */
public class Arrays {
   
   
    //finding index of an element from an integet array, 
    // if element is not return -1
    public static int searchElement(int [] array, int key){
        
        for(int i=0;i<array.length;i++){
        if(array[i]==key)
            return i;
        }
      
        return -1;
    }
    
    
    
    
    public static void swapElement(int [] array,int index1,int index2){
        int [] p=array;
        int temp=p[index1];
        p[index1]=p[index2];
        p[index2]=temp;
    }
    
            
    public static void rotateArrayByOnePosition(int[] array) throws IllegalArgumentException{
      if(array==null||array.length==0)  throw new IllegalArgumentException("Your array is empty");
      int temp=array[0];
      
      for(int i=0;i<array.length-1;i++){
        array[i]=array[i+1];
      }
      array[array.length-1]=temp;
    } 
    
    public static int binarySearch(int [] array,int key){
      int index=binarySearchRecursive(array,0,array.length-1,key);
    return index;
    }
    
    private static int binarySearchRecursive(int[] array, int begin, int end,int key) {
       int mid=(begin+end)/2;
        if(begin>end)
        return -1;
        
        if(array[mid]==key)
           return mid;
        else if(array[mid]>key){
         return binarySearchRecursive(array,begin,mid-1,key);
        }else{
         return binarySearchRecursive(array,mid+1,end,key);
       }
    }
    
    public static void  reverseArray(int [] array){
        int end=array.length-1;
        for(int i=0;i<(array.length/2);i++){
            swapElement(array, i, end-i);
        }
    }
    
    public static boolean checkArrayEquality(int [] a1,int [] a2){
    
    return true;
    }
    
    public static void removeDuplicateFromSortedArrayint(int [] a1){
    
    }
    
    public static void rotateArray(int [] a,int d){
        for(int i=0;i<d;i++){
        rotateArrayByOnePosition(a);
        }
    
    }
    
    public static void sort(int [] array){
    
    }
    public static void insertionSort(int [] array){
        for(int i=1;i<array.length;i++){
            insertLastElementAtCorrectPosition(array, 0,i);
        }
    
    }
    
    public static void selectionSort(int [] array){
        for(int i=0;i<array.length;i++){
           int minIndex=minIndex(array, i);
            swapElement(array, i, minIndex);
        }
    
    }
    
    public static String toString(int [] array){
      StringBuilder sb=new StringBuilder();
      sb.append("[");
      for(int i=0;i<array.length;i++){
        sb.append(array[i]+",");
        
      }
      sb.deleteCharAt(sb.length()-1);
      sb.append("]");
      return sb.toString();
    }
    
    public static int minIndex(int [] array,int startIndex){
    //int min=array[0];
    int minIndex=startIndex;
    for(int i=startIndex+1;i<array.length;i++){
      if(array[i]<array[minIndex])
          minIndex=i;
     }
      return minIndex;
    }

    public static void insertLastElementAtCorrectPosition(int[] array,int index,int lastIndex) {
      
       int temp=array[lastIndex];
       
       for(int i=lastIndex-1;i>=index;i--){
        if(temp>array[i]){
          array[i+1]=temp;
          return;
        }else if(temp<array[i]){
          array[i+1]=array[i];
        } 
       }
        
    }
    
   

    
}
