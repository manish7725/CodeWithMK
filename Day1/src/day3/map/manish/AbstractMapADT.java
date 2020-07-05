/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.map.manish;

import java.util.Iterator;

/**
 *
 * @author 1576202
 */
public abstract class AbstractMapADT<K,V> implements MapADT<K,V>{

  

    @Override
    public boolean isEmpty() {
     return size()==0;
    }

    protected static class MapEntry<K,V> implements Entry<K, V>{
        private K k;
        private V v;

        public MapEntry(K k, V v) {
            this.k = k;
            this.v = v;
        }
        
        
        @Override
        public K getKey() {
            return k;
         }

        @Override
        public V getValue() {
            return v;
        }
        
        protected void setKey(K key){
          k=key;
        }
        
        protected V setValue(V value){
         V old=v;
         v =value;
         return old;
        }

        @Override
        public String toString() {
            return "MapEntry{" + "k=" + k + ", v=" + v + '}';
        }
        
    }
    
    private class KeyIterator implements Iterator<K>{

        private Iterator<Entry<K,V>> entries=entrySet().iterator();
       
        public boolean hasNext() {
          return entries.hasNext();
        }

        public K next() {
          return entries.next().getKey();
        }
        
        public void remove(){
        throw new UnsupportedOperationException();
        }
    
    }
    
    private class KeyIterable implements Iterable<K>{
        public Iterator<K> iterator() {
            return new KeyIterator();
        }
    
    }
    
    @Override
    public Iterable<K> keySet(){
    return new KeyIterable();
    }
    private class ValueIterator implements Iterator<V>{

        private Iterator<Entry<K,V>> entries=entrySet().iterator();
        
        @Override
        public boolean hasNext() {
          return entries.hasNext();
        }

        @Override
        public V next() {
          return entries.next().getValue();
        }
        
        public void remove(){
        throw new UnsupportedOperationException();
        }
    
    }
    
    private class ValueIterable implements Iterable<V>{

        @Override
        public Iterator<V> iterator() {
            return new ValueIterator();
        }
    
    }
    
    public Iterable<V> values(){
       return new ValueIterable();
    }
    
  
    
    
    
}
