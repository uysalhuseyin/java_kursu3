package Gun14;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // girilen 4 sayinin toplamini yap
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
        int sayac=1;
        int toplam=0;
        while (sayac<=sayi){
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println("toplan="+toplam);
    }
}
