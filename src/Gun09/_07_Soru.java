package Gun09;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // girilen bir sayinin tek sayi olup olmadigini yazdiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        boolean tekmi=sayi%2!=0;
        System.out.println("tekmi = " + tekmi);
    }
}
