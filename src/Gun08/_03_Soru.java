package Gun08;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //girilen bir cumledeki A harfi sayisini bulunuz kucuk buyuk harf ayrimi yapmadan.
        //buyuk A bul sil kucuk a bul sil bunlarin sayisini ver
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir deger giriniz");
        String text= scan.nextLine();
       text.replace("A", "").replace("a", "").length();
        System.out.println(" A larin sayisi= " +text.length() );
    }
}
