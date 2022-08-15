package Alistirma;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        int r;
        double alan, hacim, pi=3.14;
        Scanner scan= new Scanner(System.in);
        System.out.println("Daire yari capini giriniz");
        r= scan.nextInt();
        alan=2*pi*r;
        hacim=pi*(r*r);
        System.out.println("dairenin alani = " + alan);
        System.out.println("dairenin hacmi = " + hacim);
    }
}
