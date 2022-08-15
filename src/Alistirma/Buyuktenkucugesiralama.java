package Alistirma;

import java.util.Scanner;

public class Buyuktenkucugesiralama {
    public static void main(String[] args) {
        // Girilen 3 tane sayiyi buyukten kucuge sirala
        int sayi1,sayi2,sayi3;
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayilari giriniz:");
        sayi1=scan.nextInt();
        sayi2= scan.nextInt();
        sayi3= scan.nextInt();
        if (sayi1>sayi2 && sayi1>sayi3) {
            if (sayi2 > sayi3) {
                System.out.println("sayi1 >sayi2 >sayi3");
            }
            else
                System.out.println("sayi1 > sayi3> sayi2");
        } else if (sayi2>sayi1 && sayi1>sayi3) {
            if (sayi1>sayi3) {
                System.out.println("sayi2>sayi1>sayi3");
            }
        }else
            System.out.println("Sayi2>sayi3>sayi1");

        }
        }




