package Gun21;

import java.util.Scanner;

public class _02_JavaMethod {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Sayi giriniz");
        int s1= scan.nextInt();
        System.out.println("1. Sayi giriniz");
        int s2= scan.nextInt();
        int enb=enb(s1,s2);
        System.out.println(enb);

        //_01_JavaMethod.enbBul(s1,s2); ayni paket icerisinden fonksiyon cagirmak.

    }

    public static int enb (int s1, int s2){
        if (s1>s2)
            return s1;

        else
            return  s2;



    }


}
