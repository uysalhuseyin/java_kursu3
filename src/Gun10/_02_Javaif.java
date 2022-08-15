package Gun10;

import java.util.Scanner;

public class _02_Javaif {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>=0){
            System.out.println("Sayi pozitif");
        }
        if (sayi<0){
            System.out.println("Sayi negatif");
        }
        if (sayi==0){
            System.out.println("sayi 0");
        }

    }
}
