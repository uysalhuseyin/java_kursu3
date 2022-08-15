package Odevler;

import java.util.Scanner;

public class _34_WhileForBreakContinue {
    //Kullanıcından 10 sayı isteyiniz, eğer sonra girilen önce girilenden büyük ise döngü sonlansın.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sonS=0;
        for (int i=0; i<10; i++){
            System.out.println("Bir sayi giriniz");
            int sayi= scan.nextInt();
            if (sonS>i)
                break;

            sonS=sayi;
        }
    }
}
