package Odevler;

import java.util.Scanner;

public class _17_Ifrandom {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       // Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
        //Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
        //  Aksi halde (else) "no money" yazdırın.

        System.out.println("para birimi ve miktarini giriniz");
        String para= scan.nextLine();
        if (para.contains("$")){
            System.out.println("para birimi dollar");
        }
        if (para.contains("€")){
            System.out.println("para birimi euro");
        }
        else {
            System.out.println("Fakirsin kardesim");
        }
    }
}
