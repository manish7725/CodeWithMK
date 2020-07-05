/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.map.manish;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 1576202
 */
public abstract class AbstractHashMapADT<K,V> extends AbstractMapADT<K, V> {
    protected int n=0;
    protected int capacity;
    private int prime;
    private long scale,shift;
    
    
    public AbstractHashMapADT(int cap) {
       this(cap, 109345121);

    }

    public AbstractHashMapADT(){
        this(17);
    }
    public AbstractHashMapADT(int capacity,int prime){
    this.prime=prime;
    this.capacity=capacity;
    Random rand=new Random();
    scale=rand.nextInt(prime-1)+1;
    shift=rand.nextInt(prime);
    createTable(); //-- ChainMap Open Addressing
    }
    
    @Override
    public int size(){return n;}
    
    @Override
    public V get(K key){
      return bucketGet(hashValue(key), key);
    }
    
    @Override
    public V remove(K key){
       return bucketRemove(hashValue(key), key);
    }
    
    @Override
    public V put(K key, V value){
       V answer =bucketPut(hashValue(key), key, value);
       if(n>capacity/5)
           resize(2*capacity-1);
       
       return answer;
    }

    protected abstract void createTable();
    protected abstract V bucketGet(int h,K k);
    protected abstract V bucketPut(int h,K k,V v);
    protected abstract V bucketRemove(int h,K k);

    public int hashValue(K key) {
      return (int)((Math.abs(key.hashCode()*scale+shift)%prime)%capacity);
      //return (int) Math.abs(hashCode()%capacity);
    }

    private void resize(int newCap) {
      ArrayList<Entry<K,V>> buffer=new ArrayList<>(n);
      
      for(Entry<K,V> e:entrySet()){
        buffer.add(e);
        
      }
      
      capacity=newCap;
      createTable();
      n=0;
      for(Entry<K,V> e:buffer){
          put(e.getKey(), e.getValue());
      }
      
      
    }

   
    
    
    
}
