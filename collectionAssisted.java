package Lesson2;

import java.util.*;

public class collectionAssisted {
    public static void main(String[] args) {
        // arraylist example
        System.out.println("Arraylist example :");
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        System.out.println(fruits);
        System.out.println();

        //Vector
        System.out.println("Vector example :");
        Vector<Integer> num=new Vector<>();
        num.add(10);
        num.add(20);
        num.add(30);
        System.out.println(num);
        System.out.println();

        //Linkedlist
        System.out.println("Linkedlist example :");
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        Iterator<Integer> itr=ll.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        //hashset
        System.out.println("Hashset Example :");
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        System.out.println(hs);
        System.out.println();

        //LinkedHashset
        System.out.println("LinkedHashset Example :");
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Lion");
        lhs.add("Tiger");
        lhs.add("Kangaroo");
        System.out.println(lhs);


    }
}
