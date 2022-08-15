package Odevler;

import java.util.Scanner;

public class _30_WhileForBreakContinue {
    public static void main(String[] args) {
        //Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        int tersi=0;
        while (sayi>0){

            int basamak=sayi%10;
            tersi = tersi*10+basamak;
            sayi=sayi/10;
        }

        System.out.println("tersi = " + tersi);
    }
}
