package Odevler;

import java.util.Scanner;

public class _27_WhileForBreakContinue {
    public static void main(String[] args) {

        //3-  Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.
        Scanner scan=new Scanner(System.in);
        int toplam=0;
         for (int i=0; i<10; i++){
             System.out.println("Sayi giriniz");
             int sayi= scan.nextInt();
             if (sayi%2==0){
                 toplam=toplam+sayi;

             }
             else
                 break;
         }
        System.out.println("Cift sayilarin toplami="+toplam);
    }
}
