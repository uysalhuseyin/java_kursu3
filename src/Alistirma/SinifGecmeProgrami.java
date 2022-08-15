package Alistirma;

import sun.applet.Main;

import java.util.Scanner;

public class SinifGecmeProgrami {
    public static void main(String[] args) {
        //Notlarin ortalamasini alacagiz
        //Ortalama 50 den asagi ise sinifta kalsin degil ise gecsin.
       int Turkce,mat,fen,sosyal,beden;
       double ortalama=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Turkce notunu giriniz:");
        Turkce= scan.nextInt();
        System.out.print("\nMatematik notunu giriniz:");
        mat=scan.nextInt();
        System.out.println("\n Fen bilgisi notunu giriniz:");
        fen=scan.nextInt();
        System.out.println("\n Sosyal bilgiler notunu giriniz:");
        sosyal= scan.nextInt();
        System.out.println("\n Beden egitimi notunu giriniz:");
        beden= scan.nextInt();
        ortalama=((Turkce+mat+fen+beden)/5);
        if (ortalama <50) {
            System.out.println("sinifta kaldiniz seneye bir daha deneyiniz");
        }
        else
            System.out.println("Tebrikler sinifi gectiniz");


    }
}
