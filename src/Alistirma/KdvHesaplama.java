package Alistirma;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvfiyat;
        double kdvorani=0.18;
        Scanner scan=new Scanner(System.in);
        System.out.println("Tutari giriniz");
        tutar= scan.nextDouble();
        kdvfiyat=tutar+(tutar*kdvorani);
        System.out.println("kdvli Fiyat = " + kdvfiyat);
    }
}
