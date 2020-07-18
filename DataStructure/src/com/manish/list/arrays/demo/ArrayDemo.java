/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.list.arrays.demo;

import com.manish.list.ListADT;
import com.manish.list.arrays.ArrayList;
import com.manish.list.arrays.Arrays;



/**
 *
 * @author 1576202
 */
public class ArrayDemo {
    public static void main(String[] args) {
//       int [] array={1,2,3,5,6,10,7,3,8};
//       int x=Arrays.searchElement(array, 1);
//        System.out.println(x);
//        System.out.println(Arrays.toString(array)); 
//       //{8,2,3,5,6,10,7,3,1}
//        Arrays.swapElement(array, 0, 8);
//        System.out.println(Arrays.toString(array)); 
//        //// {8,2,3,5,6,10,7,3,1}  //  2,3,4,6,10,7,3,1,8
//        int [] array1={1,2,3};
//        Arrays.rotateArrayByOnePosition(array1);
//        System.out.println(Arrays.toString(array1)); 
//        int [] array2={1,2,3,4};
//        int index=Arrays.binarySearch(array2, 1);
//        System.out.println(index);
        
//        Arrays.reverseArray(array2);
//        System.out.println(Arrays.toString(array2));
      //  Arrays.rotateArray(array2,5);
      //  System.out.println(Arrays.toString(array2));
       //change value of 1st index ==set
       //get value at index inex 1 get
       // add value 2
       // remove 
       //isEmpty();
       //size();        
       
       //int [] array2={2,1,12,3,14,15};
       //int min=Arrays.minIndex(array2,2);
        //System.out.println(min);
//        Arrays.selectionSort(array2);
//        System.out.println(Arrays.toString(array2));


      int [] array={11,2,3,14,16,7,18,9,5}; 
      
        Arrays.insertLastElementAtCorrectPosition(array,0,1);
        System.out.println(Arrays.toString(array));
        Arrays.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
