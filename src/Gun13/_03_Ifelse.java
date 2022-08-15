package Gun13;

import java.util.Scanner;
import java.util.SortedMap;

public class _03_Ifelse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Soru: Kullanicidan fizik:90 not bilgisini aliniz.
        // >=90
        //>=80
        //>=70
        //>=60
        //>=40
        //<=40 F yadiriniz
        System.out.println("Fizik notunu giriniz");
        String not= scan.nextLine();
        int ogrNot=Integer.parseInt(not.replaceAll("[0-9]", ""));//rakamlarin disinda olani al
        String dersAd=not.replaceAll("[^0,9]","");// rakamlari bosalt
        if (ogrNot>=90 ){
            System.out.println("A");
        }
    }
}
