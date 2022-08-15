package Odevler;

import java.util.Scanner;

public class _05_Ifdeyimi {
    public static void main(String[] args) {
        //1- Girilen 1 sayının onlar basamağının tek olup olmadıgını yazdırınız.
        //(sayi7/10)%10; onlar basamagi icin
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        int onlar=(sayi/10)%10;
        System.out.println("onlar = " + onlar);
        if (onlar==1){
            System.out.println("onlar basamagi tek");
        }
        else {
            System.out.println("onlar basamagi tek degil");
        }
    }
}
