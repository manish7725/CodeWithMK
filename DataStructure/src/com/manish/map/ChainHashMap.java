/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.map;

import com.manish.map.AbstractHashMapADT;
import com.manish.map.UnsortedTableMap;
import java.util.ArrayList;

/**
 *
 * @author 1576202
 */
public class ChainHashMap<K,V> extends AbstractHashMapADT<K,V> {
    
    private UnsortedTableMap<K,V> [] table; //Holder For Seperate chain
    
    public ChainHashMap(){
      super();
    }
    
    public ChainHashMap(int cap){
      super(cap);
    }
    
    public ChainHashMap(int capacity, int prime){
      super(capacity,prime);
    }

   

    @Override
    protected void createTable() {
      table=new UnsortedTableMap[capacity];
    }

    @Override
    public V put(K key, V value) {
        return super.put(key, value); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public V remove(K key) {
        return super.remove(key); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public V get(K key) {
        return super.get(key); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return super.size(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    protected V bucketGet(int h, K k) {
       UnsortedTableMap<K,V> bucket=table[h];
       if(bucket==null)
           return null;
       return bucket.get(k);

    }

    @Override
    protected V bucketPut(int h, K k, V v) {
         UnsortedTableMap<K,V> bucket=table[h];
         if(bucket==null) 
             bucket=table[h]=new UnsortedTableMap<>();
         int oldSize=bucket.size();
         V answer=bucket.put(k, v);
         n+=(bucket.size()-oldSize);
         return answer;
    }

    @Override
    protected V bucketRemove(int h, K k) {
         UnsortedTableMap<K,V> bucket=table[h];
         if(bucket==null) 
             return null;
         int oldSize=bucket.size();
         V answer=bucket.remove(k);
         n-=(oldSize-bucket.size());
         return answer;
    
    }

   

    @Override
    public Iterable<Entry<K, V>> entrySet() {
        ArrayList<Entry<K,V>> buffer=new ArrayList<>();
        for (int h = 0; h < capacity; h++) 
            if(table[h]!=null)
                for(Entry<K,V> entry : table[h].entrySet())
                    buffer.add(entry);
        return buffer;    
        
    }

    @Override
    public String toString() {
        return "ChainHashMap{" + "table=" + table + '}';
    }

    @Override
    public int hashValue(K key) {
        return super.hashValue(key); //To change body of generated methods, choose Tools | Templates.
    }
    
    

  

    
}
