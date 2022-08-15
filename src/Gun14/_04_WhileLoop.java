package Gun14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // girilen bir sayiya kadar olan sayilarin toplamini bularak yazdiriniz
        // girilen sayi

        Scanner scan=new Scanner(System.in);
        System.out.println("1 sayi giriniz");
        int sayi=scan.nextInt();
        int sayac=1;
        int toplam=0;
        while (sayac==sayi){
            toplam=toplam+sayi;
            sayac++;
        }
        System.out.println("Sayilarin toplami="+toplam);
    }
}
