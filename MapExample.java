package Lesson2;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        //HashMap
        HashMap<Integer,String> hmp=new HashMap<Integer,String>();
        hmp.put(1,"Ron");
        hmp.put(2,"Mon");
        hmp.put(3,"john");
        System.out.println("Key and Value of Hashmap are :");
        for (Map.Entry m:hmp.entrySet()){
             System.out.println(m.getKey()+" "+m.getValue());}
        System.out.println();

        //Hastable
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(101,"John");
        ht.put(102,"James");
        ht.put(103,"Lui");
        System.out.println("Key and value of Hashtable :");
        for (Map.Entry n:ht.entrySet()){
            System.out.println(n.getKey()+" "+n.getValue());
        }
        System.out.println();

        //TreeMap
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(1,"Mango");
        tm.put(2,"Apple");
        tm.put(3,"Watermelon");
        tm.put(4,"Graps");
        System.out.println("Key and value of Treemap");
        for (Map.Entry i:tm.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
