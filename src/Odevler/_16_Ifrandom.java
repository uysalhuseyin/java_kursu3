package Odevler;

import java.util.Scanner;

public class _16_Ifrandom {
    //3- Girilen 3 sayıdan en küçük olanını bulunuz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("2. sayi giriniz");
        int sayi2= scan.nextInt();
        System.out.println("3. sayi giriniz");
        int sayi3= scan.nextInt();
        System.out.println("Aralarinda en kucuk olan sayi="+Math.min(sayi1,Math.min(sayi2,sayi3)));

    }
}
