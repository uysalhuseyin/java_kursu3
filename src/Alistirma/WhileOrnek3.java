package Alistirma;

import java.util.Scanner;

public class WhileOrnek3 {
    public static void main(String[] args) {
        // 1=Faktoriyel hesaplama
        // 2=Harmonik sayilar
        // 3=yildizlar ile ucgen yapma
        // 4=uslu sayi hesaplama

        Scanner scan=new Scanner(System.in);
        System.out.println("Faktoriyel saiyisi giriniz");
        int f= scan.nextInt();
        int sonuc=1;
        while(f>0){
            sonuc*=f;
            f--;
        }
        System.out.println(sonuc);

    }
}
