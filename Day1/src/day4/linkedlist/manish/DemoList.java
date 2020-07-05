/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.linkedlist.manish;

/**
 *
 * @author 1576202
 */
public class DemoList {
    public static void main(String[] args) {
        List<Integer> l=new SinglyLinkedList<>();
        l.addFirst(10);
        l.addFirst(20);
        l.addLast(30);
        l.addFirst(40);
        l.printAll();
        System.out.println("");
        l.removeFirst();
        l.printAll();
    }
    
}
