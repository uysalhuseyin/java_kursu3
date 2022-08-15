package Alistirma;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //cok fazla if else dongosu yazmaktan kurtariyor.
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= scan.nextInt();
        switch (sayi){
            case 1:
                System.out.println("sayi 1 esittir");
                break;
            case 2:
                System.out.println("sayi 2 esittir");
                break;
            case 3:
                System.out.println("sayi 3 esittir");
                break;
            default:
                System.out.println("gecersiz bir deger");
        }

    }
}
