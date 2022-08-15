package Tekrar._01_JavaMap;

import java.util.HashMap;

public class JavaMap {
    public static void main(String[] args) {
        HashMap <Integer ,Integer> m=new HashMap<>();
        m.put(2,11); //2. key 11 value
        m.put(4,8);
        m.put(5,13);
        System.out.println("m = " + m);
        System.out.println("m.get(2) = " + m.get(2)); // 2, key degerini cagirir.
        System.out.println("m.keySet() = " + m.keySet());
        System.out.println("m.values() = " + m.values());

        // ekstra olarak forech ile de yazdirabiliriz.
        for (Integer k:m.keySet()){
            System.out.println(" keySet= " + k);
        }
        for (Integer t:m.values()){
            System.out.println(" values=" + t);
        }

        System.out.println("2 degeri varmi="+m.containsKey(2));
        System.out.println("Containsvalue="+m.containsValue(11));
        System.out.println(" size="+m.size());

    }

}
