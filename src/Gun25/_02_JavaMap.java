package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        Map<String, String> nKartvizit=new HashMap<>();
        nKartvizit.put("isim","Nazmiye");
        nKartvizit.put("email", "nazmiye@gmail.com");
        nKartvizit.put("adres","Turkiye");
        nKartvizit.put("telefon","343242342");
        System.out.println("nkartvizit.get(isim)="+nKartvizit.get("isim"));
        System.out.println("nkartvizit.get(telefon)="+nKartvizit.get("telefon"));

        Map<String, String> kKartvizit=new HashMap<>();
        kKartvizit.put("isim","kadir");
        kKartvizit.put("email","kadir@gmail.com");
        kKartvizit.put("adres","Almanya");
        kKartvizit.put("telefon","32423423525226");

        Map<String,Map<String ,String>> kartDefteri=new HashMap<>();
        kartDefteri.put("nazmiye",nKartvizit); // nazmiye anahtarina nazmiye nin kartviziti atandi
        kartDefteri.put("kadir",kKartvizit);
        System.out.println("kadirin telefonu="+kartDefteri.get("kadir").get("telefon"));

        for (Map.Entry<String,Map<String,String>> kartVizit:kartDefteri.entrySet())
            System.out.println("Kartvizit="+kartVizit);



    }
}
