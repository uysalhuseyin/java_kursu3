package Odevler;

import java.util.Scanner;

public class _02_Odev {
    public static void main(String[] args) {
    /*String text="paper";
        System.out.println("buyuk harfe cevir="+text.toUpperCase());
        String text1="OraNge";
        System.out.println("kucuk harfe cevir="+text1.toLowerCase());
        String text3="New jersey";
        System.out.println("buyuk hali="+text3.toUpperCase());
        String text4="New York";
        System.out.println("Kucuk hali="+text4.toLowerCase());
        String text5="PADDLE";
        System.out.println("kucuk hali="+text5.toLowerCase());
        String text6="apple";
        System.out.println("icinde app varmi="+text6.contains("app"));*/


        /*Scanner scan=new Scanner(System.in);
        System.out.println("bir deger giriniz");
        String text10= scan.nextLine();
        int uzunluk=text10.length();
        String bosluk=text10.replace(" ","");
        int uzunluk2=bosluk.length();
        int kelimeS=uzunluk-uzunluk2+1;
        System.out.println("Cumeldeki kelime sayisi="+kelimeS);*/

        Scanner scan2=new Scanner(System.in);
        System.out.println("3 kelimelik ad giriniz");
        String girilenkelime= scan2.nextLine();
        char firstText=girilenkelime.charAt(0);
        char SecondText=girilenkelime.charAt(girilenkelime.indexOf(" ")+1);
        System.out.println("kelime="+firstText+"."+SecondText);
    }
}
