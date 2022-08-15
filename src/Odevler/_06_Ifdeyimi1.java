package Odevler;

import java.util.Scanner;

public class _06_Ifdeyimi1 {
    public static void main(String[] args) {
        //2- Girilen bir şifrenin "Bayrak" kelimesine eşit olup olmadığını yazdırınız.
        // kelimeyi contains den cikartacagiz/
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sifre giriniz");
        String kelime= scan.nextLine();
        if (kelime.contains("bayrak")){
            System.out.println("Girilen sifre esit");
        }
        else {
            System.out.println("Girilen sifre esit degil");
        }
    }


}
