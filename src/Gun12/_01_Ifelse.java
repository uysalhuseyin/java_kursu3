package Gun12;

import java.util.Scanner;

public class _01_Ifelse {
    public static void main(String[] args) {
        // yan yana aralarinda bir boslukla girilen 2 int sayinin
        // biribirine esit olup olmadigini bulunuz.

        Scanner scan =new Scanner(System.in);
        System.out.println("2 sayiyi bir bosluk birakarak giriniz");
        String sayilar= scan.nextLine();
        int boslukindex=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0,boslukindex);
        String strSayi2=sayilar.substring(boslukindex+1);
        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);
        if (sayi1==sayi2)
        {
            System.out.println("Esit");
        }
        else
        {
            System.out.println("degil");
        }
    }
}
