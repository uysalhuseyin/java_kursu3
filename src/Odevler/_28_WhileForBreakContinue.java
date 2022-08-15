package Odevler;

import java.util.Scanner;

public class _28_WhileForBreakContinue {
    public static void main(String[] args) {
        //Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz
       Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        int sayac=0;

        while (sayi>0){
            sayi/=10;
            sayac++;
        }
        System.out.println("Basamak sayisi="+sayac);
    }
}
