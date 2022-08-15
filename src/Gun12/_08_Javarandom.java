package Gun12;

import java.util.Scanner;

public class _08_Javarandom {
    public static void main(String[] args) {
        // girilen bir sayiya kadar random sayi ureterek tahmin etmeye calisiniz.
        // Kullanici bilirse tebrikler yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("kaça kadar sayı tutulsun");
        int kacakadarolsun= scan.nextInt();
        int tutulansayi=(int)(Math.random() *kacakadarolsun);
        System.out.println("Tahminiz=");
        int tahmin= scan.nextInt();
        if (tutulansayi==tahmin){
            System.out.println("Tebrikler");
        }
        else {
            System.out.println("bilemedin mal");
        }
    }
}
