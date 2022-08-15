package Gun12;

import java.util.Scanner;

public class _04_Ozelornek {
    public static void main(String[] args) {
        // girilen sayi tek mi cift mi
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        String sonuc=(sayi%2==1) ? "tek" : "cift"; // bir if kullanacagimiz zaman bu sistemi kullabiliriz.
        System.out.println("sonuc="+sonuc);
    }
}
