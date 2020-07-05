/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.map.manish;

import day1.array.manish.ArrayList;

/**
 *
 * @author 1576202
 */
public class UnsortedTableMap<K,V> extends AbstractMapADT<K,V> {
    

    private ArrayList<MapEntry<K,V>> table=new ArrayList<>();
    
    public UnsortedTableMap(){};
    
    private int findIndex(K key){    // 0 
    
        int n=table.size();
        for (int i = 0; i < n; i++) 
            if(table.get(i).getKey().equals(key))
            return i;
        return -1;    
    }

    @Override
    public int size() {
     return table.size();
    }

   

    @Override
    public V get(K key) {
     int i=findIndex(key);
     if(i==-1) return null;
     return table.get(i).getValue();
    }

    @Override
    public V put(K key, V value) {
    int j=findIndex(key);
    if(j==-1){
        table.add(new MapEntry<K, V>(key,value));
        return null;
    }else 
        return table.get(j).setValue(value);

    }

    @Override
    public V remove(K key) {
     int j=findIndex(key);
     if(j==-1) return null;
     int n=size();
     V answer=table.get(j).getValue();
     if( j!= n-1)                              //
         table.set(j,table.get(n-1));
     table.remove(n-1);
     return answer;    

    }

    
    
    

    @Override
    public Iterable<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "UnsortedTableMap{" + "table=" + table + '}';
    }

    
    
}
