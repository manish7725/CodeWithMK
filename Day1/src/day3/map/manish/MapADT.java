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
public interface  MapADT<K,V> {
    
    int size();
    boolean isEmpty();
    boolean containsKey(K key);
    boolean containsValue(K value);
    V get(K key);
    V put(K key, V value);
    V remove(K key);
    Iterable<K> keySet();
    Iterable<V> values();
    Iterable<Entry<K, V>> entrySet();
  
    interface Entry<K,V> {
       
        K getKey();
        V getValue();
        @Override
        boolean equals(Object o);
        @Override
        int hashCode();

   
    }

    @Override
    boolean equals(Object o);


    @Override
    int hashCode();


    default V getOrDefault(K key, V defaultValue) {
        V v;
        return (((v = get(key)) != null) || containsKey(key))
            ? v
            : defaultValue;
    }

   
    default boolean remove(K key, Object value) {
        Object curValue = get(key);
        if (!Objects.equals(curValue, value) ||
            (curValue == null && !containsKey(key))) {
            return false;
        }
        remove(key);
        return true;
    }

    
    default boolean replace(K key, V oldValue, V newValue) {
        Object curValue = get(key);
        if (!Objects.equals(curValue, oldValue) ||
            (curValue == null && !containsKey(key))) {
            return false;
        }
        put(key, newValue);
        return true;
    }

    
    default V replace(K key, V value) {
        V curValue;
        if (((curValue = get(key)) != null) || containsKey(key)) {
            curValue = put(key, value);
        }
        return curValue;
    }

}
