package Alistirma;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        // Hava sicakligi al
        //Sicaklik 30 veya uzerinde ise denize git
        //5 veya 30 arasinda ise sinemaya git
        //4 ve daha az ise kayak yapmaya git.
        int sicaklik;
        Scanner scan=new Scanner(System.in);
        System.out.println("Hava sicakligini giriniz");
        sicaklik=scan.nextInt();
        if (sicaklik >=30) {
            System.out.println("Denize git kardesim");
        } else if (sicaklik<30 && sicaklik>=5) {
            System.out.println("Sen sinamaya git kardesim");
        }
        else
            System.out.println("Hava soguk kardes sen kayak yapmaya git");

    }
}
