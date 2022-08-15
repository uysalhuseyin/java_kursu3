package Gun10;

import java.util.Scanner;

public class _06_Javaif {
    public static void main(String[] args) {
        //girilen 3 sayinin en buyuk olani yaziniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayi ");
        int sayi1= scan.nextInt();
        System.out.println("2.sayi");
        int sayi2= scan.nextInt();
        System.out.println("3.sayi");
        int sayi3= scan.nextInt();

        int enb=sayi1;
        if (sayi2>enb){
            enb=sayi2;
        }
        if (sayi3>enb){
            enb=sayi3;
        }
        System.out.println("enbuyuk sayi= " + enb);

    }
}
