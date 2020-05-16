/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.array.manish;

/**
 *
 * @author 1576202
 */
public interface ArrayADT {
  
       
       
        //print all element
        public void printAllElement(int [] arr);
        
        //print all element in reverse order using recursion
        public void printAllElementinReverseRecursion(int [] arr);
        
        //searchAnElement and return index if not then -1
        
        public int searchKey(int [] arr,int searchKey);
        
        
        //swapElement with given index      
        public void swapElement(int [] arr,int index1,int index2);
        
        
        //get midIndex of an array 
        
        public int getMidIndex(int [] arr,int index1,int index2);
        
        
        //binarySearch of an array
        
        public int binarySearch(int [] arr,int searchKey,int first,int last);
        
        
       // Sort array using selection Sort
        public void selectionSort(int [] arr);
          
       //Sort array using insertion sort
        public void insertionSort(int [] arr);
        
        
        //reverse an array
        public void reverseArray(int [] arr);
        
        //checkArray equality
        
        public boolean checkArraysEquality(int [] arr1,int [] arr2);
        
        
        //remove duplicate from Sorted Array
        
        public int removeDuplicateFromSortedArrayint( int [] arr);
        
        
        //rotateArray
        
        public void rotateArray(int [] arr,int d);
        
        //add element at given index
        
        public void addElement(int [] arr,int element);
        
        //remove elemet from given index
        
        public void removeElement(int [] arr,int index);
        
        //get element from index
        
        public int getElement(int [] arr,int index);
        
        //set element at index
        
        public void setElement(int [] arr,int index);
        
       
}
