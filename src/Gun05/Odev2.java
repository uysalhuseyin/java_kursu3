package Gun05;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
     String isim,meyve,sehir,dogum;
     int sayi,kapi;
     boolean banka;
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz lutfen:");
        isim= scan.nextLine();
        System.out.println("Lutfen her hangi bir sayi giriniz");
        sayi= scan.nextInt();
        Scanner scan2=new Scanner(System.in);

        System.out.println("Lutfen en sevdiginiz meyveyi yaziniz");
        meyve= scan2.nextLine();
        System.out.println("Arabinizdaki kapi sayisini giriniz");
        kapi= scan2.nextInt();
        Scanner scan3=new Scanner(System.in);
        System.out.println("On sene onceki yasadiginiz sehri giriniz");
        sehir=scan3.nextLine();
        System.out.println("Dogum gununu giriniz");
        dogum=scan3.nextLine();
        System.out.println("Banka hesabiniz mevcut mu");
        banka=scan3.nextBoolean();

        System.out.println("isminiz = " + isim);
        System.out.println("Girdiniz sayi = " + sayi);
        System.out.println("En sevdiginiz meyve = " + meyve);
        System.out.println("Arabanizdaki kapi sayisi = " + kapi);
        System.out.println("Dogum gununuz = " + dogum);
        System.out.println("Banka hesabiniz var mi yok mu = " + banka);
    }
}
