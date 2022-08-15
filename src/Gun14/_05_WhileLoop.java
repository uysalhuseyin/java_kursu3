package Gun14;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // girilen bir sayiya kadar olan sayilardan sadece tek olanlarinin toplamini bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sinir= scan.nextInt();
        int sayac=1;
        int toplam=0;
        /*while(sayac<=sinir){
            if (sayac%2==1){
                toplam=toplam+sayac;
                sayac++;
            }
            System.out.println("toplam="+toplam);
        }*/
        // pratik yol
        sayac=1;
        toplam=0;
        while (sayac<=sinir){
            toplam=toplam+sayac;
            sayac=sayac+2;

        }
        System.out.println("toplam=+"+toplam);
    }
}

