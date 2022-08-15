package Alistirma;

import java.util.Scanner;

public class Cemberincevresi {
    public static void main(String[] args) {
        //cemberin cevresi=2*pi*r

      Scanner scan=new Scanner(System.in);
        System.out.println("Cemberin yarin capini giriniz:");
        int a= scan.nextInt();
        System.out.println("cemberin yari capi = " +(2*Math.PI*a));

    }
}
