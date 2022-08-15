package Gun07;

import java.util.Scanner;

public class _12_10soruodev {
    public static void main(String[] args) {
        //10.soru girilen 3 kelimelik ismi a.y.t seklinde yazdiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("3 kelimelik deger giriniz");
        String adsoyad= scan.nextLine();
        char ilkharf=adsoyad.charAt(0);
        char ikinciH=adsoyad.charAt(adsoyad.indexOf(" ")+1);
        char ucuncuH=adsoyad.charAt(adsoyad.lastIndexOf(" ")+1);
        System.out.println("kia hali="+ilkharf+"."+ikinciH+"."+ucuncuH);
    }
}
