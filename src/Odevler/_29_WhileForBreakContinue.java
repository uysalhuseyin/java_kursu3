package Odevler;

import java.util.Scanner;

public class _29_WhileForBreakContinue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        int ilk=sayi%10;
        int son=0;
        while(sayi>9){
            sayi=sayi/10;
            son=sayi;
        }

        System.out.println("ilk basamak="+ilk);
        System.out.println("son basamak="+son);
        if (ilk==son)
            System.out.println("esit");
            else
            System.out.println("Esit degil");

    }
}
