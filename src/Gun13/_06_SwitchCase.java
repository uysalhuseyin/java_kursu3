package Gun13;

import java.util.Scanner;

public class _06_SwitchCase {
    public static void main(String[] args) {
        //Girilen 2 tam sayinin kullanicidan aldiktan sonra,
        // Toplama icin T , Cikartma C, Carpma icin P, bolme icin B
        // harflerini alarak istege uygun olan islem yaptirip
        // sonucu yazdiriz (Switch kullaniz)

        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("1. sayi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("Toplam icin T\nCikarma icin C\nCarpma icin P\nBolme icin B\n basiniz");
        Scanner scan2=new Scanner(System.in);
        String islem=scan2.next(); // String tipinde okundu
        switch (islem.toUpperCase()){
            case "T": System.out.println("toplam="+(sayi1+sayi2));break;
            case "C": System.out.println("cikarma="+(sayi1-sayi2));break;
            case "P": System.out.println("carpma="+(sayi1*sayi2));break;
            case "B": System.out.println("bolme="+(sayi1/sayi2));break;
            default: System.out.println("Hatili giris");break;


        }


    }
}
