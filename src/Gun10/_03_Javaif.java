package Gun10;

import java.util.Scanner;

public class _03_Javaif {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("2. sayi giriniz");
        int sayi2=scan.nextInt();
        if (sayi1>sayi2){
            System.out.println("1 sayi buyuk 2 den");
        }
        if (sayi2>sayi1){
            System.out.println("2. sayi buyuk 1 den");
        }
        if (sayi1==sayi2){
            System.out.println("Sayilar esit");
        }
    }
}
