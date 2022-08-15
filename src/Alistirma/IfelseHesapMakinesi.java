package Alistirma;

import java.util.Scanner;

public class IfelseHesapMakinesi {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int secim,islem;
        System.out.println("1. Sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("2. Sayiyi giriniz");
        int sayi2=scan.nextInt();


        System.out.println("ISLEMI SECINIZ");
        System.out.println("1. toplama");
        System.out.println("2. cikarma");
        System.out.println("3. carpma");
        System.out.println("4. bolme");
        System.out.println("Seciminizi giriniz");
         secim=scan.nextInt();

        if (secim == 1) {
            System.out.println("toplama islemi:"+(sayi1+sayi2));
        } else if (secim==2) {
            System.out.println("cikarma islemi:"+(sayi1-sayi2));
        } else if (secim==3) {
            System.out.println("carpma islemi:"+(sayi1*sayi2));
        } else if (secim==4) {
            System.out.println("bolme islemi:"+(sayi1/sayi2));


        }else
            System.out.println("Gecersiz bir komut girdiniz");




        }

    }





