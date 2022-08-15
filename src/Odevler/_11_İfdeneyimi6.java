package Odevler;

import java.util.Scanner;

public class _11_İfdeneyimi6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("2. sayi giriniz");
        int sayi2= scan.nextInt();
        System.out.println("3. sayi giriniz");
        int sayi3= scan.nextInt();
        int enb=sayi1;
        if (sayi2>enb){
            enb=sayi2;
        }
        if (sayi3>enb){
            enb=sayi3;
        }
        System.out.println("En buyuk sayi = " + enb);
    }
}
