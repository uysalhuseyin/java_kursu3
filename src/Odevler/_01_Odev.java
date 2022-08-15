package Odevler;

import java.util.Scanner;

public class _01_Odev {
    public static void main(String[] args) {
        String text="i love java";
        System.out.println("Toplam karakter sayisi="+text.length());

        String tex2="Sprint planning";
        System.out.println("Toplam karakter sayisi="+tex2.length());

        String text3="apple";
        System.out.println("Icinde app varmi="+text3.contains("app"));

        String text4="orange";
        System.out.println("orange aplle esitmi="+text4.equals(text3));

        System.out.println("apple APPLE kelimesine esitmi="+text3.equalsIgnoreCase("APPLE"));


        String text5="Floria";
        System.out.println("o harfinin bulundugu index="+text5.indexOf("o"));

        String text6="Thank you";
        System.out.println("y harfinin konumu="+text6.indexOf("y"));

        String text7="mouse";
        System.out.println("mouse kelimesinin 3.siradaki degeri="+text7.charAt(3));

        Scanner scan=new Scanner(System.in);
        System.out.println("3 kelimelik ad giriniz");
        String adsoyad= scan.nextLine();
        char firstText=adsoyad.charAt(0);
        char SecondText=adsoyad.charAt(adsoyad.indexOf(" ")+1);
        char lastText=adsoyad.charAt(adsoyad.lastIndexOf(" ")+1);
        System.out.println("X.Y.Z seklinde girilen isim="+firstText+"."+SecondText+"."+lastText);


    }
}
