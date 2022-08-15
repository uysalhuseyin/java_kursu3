package Gun25;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        Map<Integer, String> hm=new HashMap<>();
        hm.put(9,"keci");
        hm.put(2,"koyun");
        hm.put(30,"teke");
        hm.put(4,"inek");
        hm.put(11,"kopek");


        Map<Integer, String> Lhm=new LinkedHashMap<>();
        Lhm.put(9,"keci");
        Lhm.put(2,"koyun");
        Lhm.put(30,"teke");
        Lhm.put(4,"inek");
        Lhm.put(11,"kopek");

    }
}
