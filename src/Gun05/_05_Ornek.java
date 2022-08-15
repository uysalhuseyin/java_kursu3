package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi1, sayi2;
        System.out.println("Birinci sayi giriniz");
        sayi1= scan.nextInt();
        System.out.println("ikinici sayi giriniz");
        sayi2=scan.nextInt();
        System.out.println("sayilarin toplami = " + (sayi1+sayi2));
    }
}
