/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.map.manish.seperateChaining;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author 1576202
 */
class Solution {
    
    public static void main(String[] args) {
        int [] arr={2,4,5,6};
        int target=9; // target-arr[0]=5 [1,2],[2,1]
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int [] out=new int[2];
        HashMap<Integer,Integer> h=new HashMap<>();
        
       for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(h.containsKey(x)){
                out[0]=h.get(x);
                out[1]=i;
                break;
            }
            h.put(nums[i],i);
       }
       return out; 
    }
}
