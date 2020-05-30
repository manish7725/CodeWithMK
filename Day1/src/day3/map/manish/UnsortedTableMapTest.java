/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.map.manish;

/**
 *
 * @author 1576202
 */
public class UnsortedTableMapTest {
    public static void main(String[] args) {
        UnsortedTableMap<Integer,Integer> map=new UnsortedTableMap<>();
        System.out.println(map.toString());
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        System.out.println(map.toString());
        System.out.println( map.get(2));
        System.out.println(map.remove(2));
        System.out.println(map);
                
       
        
    }
    
}
