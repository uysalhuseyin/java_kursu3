package Gun24;

import javax.jws.soap.SOAPBinding;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _02_HashSet {
    public static void main(String[] args) {
        HashSet <String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Red");
        renkler.add("RED");
        System.out.println("Renkler="+renkler);

        for(String s:renkler){
            System.out.println("Renkler="+s); //renklerin icindeki elemanlari bir sirayla s ismi vererek gondriyor.
        }

        TreeSet <String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        System.out.println("ts="+ts);
        

        Iterator gosterge=ts.iterator();
        while(gosterge.hasNext()){
            System.out.println("gosterge = " + gosterge.next()); // siradaki
        }
            


    }
}
