package Odevler;

import java.util.Scanner;

public class _09_Ifdeneyimi4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. kelimeyi giriniz");
        String kelime1= scan.nextLine();
        System.out.println("2. kelimeyi giriniz");
        String kelime2= scan.nextLine();
        int uzunluk1=kelime1.length();
        int uzunluk2=kelime2.length();
        if (uzunluk1==uzunluk2){
            System.out.println("2 kelimenin uzunlugu esit");
        }
        else {
            System.out.println("uzunluk esit degil");
        }
    }
}
