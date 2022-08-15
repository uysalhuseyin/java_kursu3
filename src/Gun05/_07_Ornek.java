package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu giriniz");
        int boy= scan.nextInt();
        System.out.println("kilonuzu giriniz");
        double kilo=scan.nextDouble();
        double bki=kilo/(boy*boy);
        System.out.println("beden kitle indeksiniz = " + bki);
    }
}
