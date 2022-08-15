package Gun14;

import java.util.Scanner;

public class _06_Dowhile {
    public static void main(String[] args) {
        // kulannicidan 0 degeri girine kadar girdigi sayilarinin toplamini bulunuz.
        Scanner scan=new Scanner(System.in);
        /*System.out.println("sayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;
       while (sayi!=0){
           toplam=toplam+sayi;
           System.out.println("sayi giriniz");
           sayi=scan.nextInt();

       }
        System.out.println("toplam="+toplam);*/

        int toplam=0;
        int sayi=0;
        do {
            System.out.println("sayi giriniz");
            sayi= scan.nextInt();
            toplam=toplam+sayi;

        }while (sayi!=0);
        System.out.println("toplam="+toplam);
    }
}
