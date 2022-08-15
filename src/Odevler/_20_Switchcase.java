package Odevler;

import java.util.Scanner;

public class _20_Switchcase {
    public static void main(String[] args) {
        //Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.print("Number =");
        int number= scan.nextInt();

        int ones=number%10;
        int tens=(number/10)%10;
        int hundreds =number/100;

        switch (hundreds){
            case 1:System.out.print("yüz"); break;
            case 2:System.out.print("iki yüz"); break;
            case 3:System.out.print("üç yüz"); break;
            case 4:System.out.print("dört yüz"); break;
            case 5:System.out.print("beş yüz"); break;
            case 6:System.out.print("altı yüz"); break;
            case 7:System.out.print("yedi yüz"); break;
            case 8:System.out.print("sekiz yüz"); break;
            case 9:System.out.print("dokuz yüz"); break;
        }

        switch (tens){
            case 0:System.out.print(""); break;
            case 1:System.out.print("on"); break;
            case 2:System.out.print("yirmi"); break;
            case 3:System.out.print("otuz"); break;
            case 4:System.out.print("kırk"); break;
            case 5:System.out.print("elli"); break;
            case 6:System.out.print("altmış"); break;
            case 7:System.out.print("yetmiş"); break;
            case 8:System.out.print("seksen"); break;
            case 9:System.out.print("doksan"); break;
        }

        switch (ones){
            case 0:System.out.print(""); break;
            case 1:System.out.print("bir"); break;
            case 2:System.out.print("iki"); break;
            case 3:System.out.print("üç"); break;
            case 4:System.out.print("dört"); break;
            case 5:System.out.print("beş"); break;
            case 6:System.out.print("altı"); break;
            case 7:System.out.print("yedi"); break;
            case 8:System.out.print("sekiz"); break;
            case 9:System.out.print("dokuz"); break;
        }
    }
}
