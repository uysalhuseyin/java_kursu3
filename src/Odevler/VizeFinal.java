package Odevler;

import java.util.Scanner;

public class VizeFinal {
    public static void main(String[] args) {
        int vize,Ffinal;
        double ortalama;
        Scanner scan=new Scanner(System.in);
        System.out.println("vize notunu giriniz");
        int sayi= scan.nextInt();
        System.out.println("final notunu giriniz");
        int sayi2= scan.nextInt();
        ortalama=(sayi*0.4)+(sayi2*0.6);
        System.out.println("ortalama = " + ortalama);

        if (ortalama>50){
            System.out.println("Gecti");
        }else
            System.out.println("Kaldi");

    }
}
