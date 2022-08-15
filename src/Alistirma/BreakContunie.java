package Alistirma;

import java.util.Scanner;

public class BreakContunie {
    public static void main(String[] args) {
        // kodda nereye break yazar isek dongu o anda biter.
        // break donguyu durduru.
        // continue donguyu durdurmaz bir sonraki adima gider.

        Scanner scan=new Scanner(System.in);
        /*int sayi;
        while (true){
            System.out.println("Bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayi==0){
                break;
            }
            System.out.println(sayi);
        }

         */
        for (int i=1; i<=10 ; i++){
            if (i==4 || i==9){
                System.out.println("atladi="+i);
                continue;
            }
            System.out.println("i="+i);
        }
    }
}
