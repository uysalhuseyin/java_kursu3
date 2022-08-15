package Gun09;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //kullanicinin girecegi 2 sayinin birbirine esit olup olmadigini yaziniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("1 sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("2 sayiyi giriniz");
        int sayi2= scan.nextInt();
        boolean esitmi=sayi1==sayi2;
        System.out.println("esitmi = " + esitmi);

    }
}
