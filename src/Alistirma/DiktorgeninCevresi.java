package Alistirma;

import java.util.Scanner;

public class DiktorgeninCevresi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int kenar1, kenar2;
        System.out.println("Birinci kenari yaziniz");
        kenar1= scan.nextInt();
        System.out.println("Ikinci kenari giriniz");
        kenar2= scan.nextInt();
        System.out.println("dikdortgenin alani = " + (kenar1*kenar2));
        System.out.println("diktorgenin cevresi = " +(2*(kenar1+kenar2)) );
    }
}
