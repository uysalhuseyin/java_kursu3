package Gun12;

import java.net.Socket;
import java.util.Scanner;

public class _02_Ifelse {
    public static void main(String[] args) {
        // girilen bir sayinin pozitif veya negatif veya sifir esit oldugunu yaziniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>0){
            System.out.println("Pozitif");
        }
        else if (sayi==0) {
            System.out.println("sayi 0");
        }
        else {
            System.out.println("Negatif");
        }
    }
}
