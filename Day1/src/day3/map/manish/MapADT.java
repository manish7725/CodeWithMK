/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.map.manish;

import java.util.Objects;

/**
 *
 * @author 1576202
 * @param <K>
 * @param <V>
 */
public interface MapADT<K, V> {

    int size();

    boolean isEmpty();


    V get(K key);

    V put(K key, V value);

    V remove(K key);

    Iterable<K> keySet();

    Iterable<V> values();

    Iterable<Entry<K, V>> entrySet();

    interface Entry<K, V> {

        K getKey();

        V getValue();

      
        public String toString();

        public boolean equals(Object obj);

       

        @Override
        public int hashCode();
       
        
    }

  

}
