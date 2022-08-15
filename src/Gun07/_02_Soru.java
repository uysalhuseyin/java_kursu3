package Gun07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        //girilen bir ad soyadini ayirim ayri ayri yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Ad soyad gir");
        String adSoyad= scan.nextLine();
        // boslugu indexini bulup substringle alabiliriz.
        int bosluk=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,bosluk);
        String soyad=adSoyad.substring(bosluk+1);
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}
