/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.map.manish.seperateChaining;



/**
 *
 * @author 1576202
 */
public class ChainHashMapDemo {
    public static void main(String[] args) {
        ChainHashMap<String,Integer> chainMap=new ChainHashMap<>();
        System.out.println(chainMap);
        String s1="Manish";
        
        chainMap.put("Manish", 1);
        //System.out.println(chainMap.hashValue("Manish"));
        //System.out.println(s1.hashCode());
        chainMap.put("Sumit", 2);
        chainMap.put("Rakesh", 3);
        
        chainMap.put("Xyz", 2);
        chainMap.put("abc", 3);
        
        chainMap.put("bacde", 2);
        chainMap.put("fghi", 3);
        
        
        
        chainMap.remove("Manish");
    
    }
    
   
}
