package Alistirma;

import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        // String degerlerde esittir degerini yakalaya bilmek icin equals kullaniyoruz.
        // parantez icinde deger dogru mu degil mi kontrol ediyor.
        Scanner scan=new Scanner(System.in);
        String userId , parola;
        System.out.print("Kullanici adini giriniz:");
        userId=scan.nextLine();
        System.out.print("Sifrenizi giriniz:");
        parola=scan.nextLine();
        if (userId.equals("java") && parola.equals("123")) {
            System.out.println("Basarili giris");
        }
        else
            System.out.println("kullanici adiniz veya parolaniz yanlis");
    }
}
