package Odevler;

import java.util.Scanner;

public class _10_Ifdeneyimi5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sifre giriniz");
        String sifre= scan.nextLine();
        int uzunluk=sifre.length();
        if (uzunluk>=8){
            System.out.println("sifre kabul edildi");
        }
        else
            System.out.println("sifre kabul edilmedi");
    }
}
