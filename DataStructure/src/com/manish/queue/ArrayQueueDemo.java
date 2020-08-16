/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.queue;

import java.util.Arrays;

/**
 *
 * @author 1576202
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue<Integer> q=new ArrayQueue<>(10);
        q.enquue(10);
        q.enquue(20);
        q.enquue(30);
        q.enquue(10);
        q.enquue(20);
        q.enquue(30);
        q.enquue(10);
        q.enquue(20);
        q.enquue(30);
        q.enquue(30);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enquue(100);
        //q.enquue(30);
        
        System.out.println(Arrays.toString(q.getData()));
    }
    
}
