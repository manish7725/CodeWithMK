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
public class Arrays implements ArrayADT{

 
    @Override
    public void printAllElement(int[] arr) {
        printElement(arr, 0);
    }
    
    private static void printElement(int[] arr, int i) {
     if(i==arr.length){
      return;
     }else{ 
         System.out.println(arr[i]);
         printElement(arr, i+1);
         System.out.println(arr[i]);
       
     }
    }

    @Override
    public void printAllElementinReverseRecursion(int[] arr) {
        printElement(arr, 0);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchKey(int[] arr, int searchKey) {
       for(int i=0;i<arr.length;i++){
         if(arr[i]==searchKey)
             return i;
       }
       return -1;
    }

    @Override
    public void swapElement(int[] arr, int index1, int index2) {
        if(arr==null || index1<0 || index1>arr.length-1) {
          //throw IllegalArgumentException
          return;
      } 
      int temp=arr[index1];
      arr[index1]=arr[index2];
      arr[index2]=temp;
    }

    @Override
    public int getMidIndex(int[] arr, int index1, int index2) {
     int mid=index1+(index2-index1)/2;
     return mid;

    }

    @Override
    public int binarySearch(int[] arr, int searchKey, int first, int last) {
        int mid=first+(last-first)/2;
        if(first>last)
            return -1;
        else{
        if(searchKey==arr[mid]){
             return mid;
        }
        else if(searchKey>arr[mid])
            return binarySearch(arr, searchKey, mid+1, last);
        else 
           return  binarySearch(arr, searchKey, first, mid-1);
        }
    }

    @Override
    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                    System.out.println(" i= " + i + "  j= " + j + "  imin_index  " + min_index);
                }
            }
            swapElement(arr, i, min_index);
            System.out.println(java.util.Arrays.toString(arr));
        }
    }

    @Override
    public void insertionSort(int[] arr) {
    int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
       }

    @Override
    public void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    @Override
    public boolean checkArraysEquality(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        } else {
            boolean isEqual = true;
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    System.out.println("False.they are not equal");
                    isEqual = false;
                    break;
                }
            }

            return isEqual;

        }
    }

    @Override
    public int removeDuplicateFromSortedArrayint(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length - 1];
        return j;
    }

    @Override
    public void rotateArray(int[] arr,int d) {
       for(int i=0;i<d;i++){
        rotateArrayByOnePosition(arr);
        }

    }
    
    private static void rotateArrayByOnePosition(int[] arr) {
     int temp=arr[arr.length-1];
     for(int i=arr.length-2;i>=0;i--){
        arr[i+1]=arr[i];
     }
     arr[0]=temp;
    }

    @Override
    public void addElement(int[] arr, int element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeElement(int[] arr, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getElement(int[] arr, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setElement(int[] arr, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
