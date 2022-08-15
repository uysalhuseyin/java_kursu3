package Gun13;

import java.util.Scanner;

public class _02_Elseif {
    public static void main(String[] args) {
        // girilen 2 tam sayiyi kullanicinin aldiktan sonra
        // toplama icin T, .cikarma C carpa icin p bolme icin B
        // harflerini alarak istege uygun olan islemi yaptirip
        // sonucu yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2= scan.nextInt();
        System.out.println("ISLEMI SECINIZ");
        System.out.println("1. Toplama");
        System.out.println("2. Cikarma");
        System.out.println("3. Carpma");
        System.out.println("4. Bolme");
        System.out.println("Seciminizi giriniz");
        int secim=scan.nextInt();

        if (secim==1){
            System.out.println("Toplama islemi="+(sayi1+sayi2));
        } else if (secim==2) {
            System.out.println("Cikarma islemi="+(sayi1-sayi2));

        } else if (secim==3) {
            System.out.println("Carpma islemi="+(sayi1*sayi2));
        } else if (secim==4) {
            System.out.println("Bolme="+(sayi1/sayi2));

        }
        else {
            System.out.println("1 ile 4 arasinda secim yapin lutfen!!");
        }


    }



}
