package Alistirma;

import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        int bakiye=500,input,miktar;
        Scanner scan=new Scanner(System.in);
        System.out.println("Merhaba Yoruk banka hosgeldiniz");
        System.out.println("Guncel bakiyeniz = " + bakiye+"TL");
        while (bakiye>0){
            System.out.println("1. Para yatir");
            System.out.println("2. Para cekme");
            System.out.println("3. Bakiye sorgulama");
            System.out.println("4. Cikis yap");
            input= scan.nextInt();
            if (input==1){
                System.out.println("Yatirim yapmak istediginiz tutari giriniz");
                miktar= scan.nextInt();
                bakiye+=miktar;
            } else if (input==2) {
                System.out.println("Cekmek istediginizm miktari girniiz");
                miktar= scan.nextInt();
                if (miktar>bakiye){
                    System.out.println("Yetersiz bakiye");
                }else
                    bakiye-=miktar;

            } else if (input==3) {
                System.out.println("Guncel bakiyeniz = " + bakiye);

            } else if (input==4) {
                System.out.println("Tekrar bekleriz");
                break;
            }else
                System.out.println("Gecersiz bir komut girdiniz");
        }
    }
}
