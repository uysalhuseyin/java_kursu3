package Gun24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS: Hashset (hizli), LinkedHashset (ekleme sirasina gore sirali), Treeset (her zaman sirali)

        // hizli calismak icin kendi ozel algoritma sirasina gore saklar.

        HashSet <String> hs= new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");

        System.out.println("hs="+hs);

        // eklenme  sirasina gore saklar.
        LinkedHashSet <String> Lhs= new LinkedHashSet<>();
        Lhs.add("bir");
        Lhs.add("iki");
        Lhs.add("uc");
        Lhs.add("dort");
        Lhs.add("bes");

        System.out.println("inkedHashSet="+Lhs);

        //Alfebedik olarak sirali tutar.
        TreeSet <String> Ths= new TreeSet<>();
        Ths.add("bir");
        Ths.add("iki");
        Ths.add("uc");
        Ths.add("dort");
        Ths.add("bes");

        System.out.println("TreeSet="+Ths);




    }




}
