package Gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _05_Sets {
    public static void main(String[] args) {

        Integer[] dizi=new Integer[]{1,2,3,4,5,5,6,6,7};
        System.out.println("Dizi="+Arrays.toString(dizi));
        HashSet <Integer> hs=new HashSet<>();
        for (int i = 0; i < dizi.length ; i++)
            hs.add(dizi[i]);
        System.out.println("hs = " + hs);

       HashSet <Integer> hs2=new HashSet<>(Arrays.asList(dizi));
        System.out.println("hs2 = " + hs2);
    }
}
