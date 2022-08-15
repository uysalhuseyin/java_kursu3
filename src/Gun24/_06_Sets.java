package Gun24;

import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {
        HashSet <Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet <Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        HashSet <Integer> birlesikhali=new HashSet<>();
        birlesikhali.addAll(setA); // addAll ve RemovaAll ayni Arraylist lerde gecerlidir.
        birlesikhali.addAll(setB);
        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);
        System.out.println("birlesikhali = " + birlesikhali);

        HashSet <Integer> ortak=new HashSet<>();
        ortak.addAll(setA);
        ortak.retainAll(setB);
        System.out.println("ortak elemanlar = " + ortak);


    }
}
