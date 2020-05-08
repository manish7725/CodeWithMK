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
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        
        //print all element
        printAllElement(arr);
        
        //print all element in reverse order using recursion
        printAllElementinReverseRecursion(arr);
        
        //searchAnElement and return index if not then -1
        
        int resultIndex=searchKey(arr,5);
        
        
        //swapElement with given index
        
        swapElement(arr,2,3);
        
        
        //get midIndex of an array 
        
        int midIndex=getMidIndex(arr,2,6);
        
        
        //binarySearch of an array
        
        int resultIndex2=binarySearch(arr);
        
        
        //Sort array using selection Sort
        selectionSort(arr);
        
        
        //Sort array using insertion sort
        insertionSort(arr);
        
        
        //reverse an array
        reverseArray(arr);
        
        //checkArray equality
        
        boolean result=checkArraysEquality(arr,arr);
        
        
        //remove duplicate from Sorted Array
        
        removeDuplicateFromSortedArray(arr);
        
        
        //rotateArray
        
        rotateArray(arr);
        
        
        
        
        
        
        
        
        
        
        
        
    }

    private static void printAllElement(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void printAllElementinReverseRecursion(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int searchKey(int[] arr, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void swapElement(int[] arr, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int getMidIndex(int[] arr, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int binarySearch(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void selectionSort(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void insertionSort(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void reverseArray(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean checkArraysEquality(int[] arr, int[] arr0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removeDuplicateFromSortedArray(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void rotateArray(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
