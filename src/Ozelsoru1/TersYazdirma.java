package Ozelsoru1;

import java.util.Scanner;

public class TersYazdirma {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int sayi= scan.nextInt();
        System.out.println("tersten yazilisi=");
        while (sayi>0) {
            System.out.println(sayi%10);
            sayi/=10;
        }
    }
}
