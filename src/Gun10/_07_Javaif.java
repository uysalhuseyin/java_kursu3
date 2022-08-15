package Gun10;

import java.util.Scanner;

public class _07_Javaif {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Notu giriniz");
        int sayi= scan.nextInt();
        if (sayi>=50){
            System.out.println("gecti");
        }
        if (sayi<50){
            System.out.println("kaldi");
        }
    }
}
