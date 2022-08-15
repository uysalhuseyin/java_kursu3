package Gun10;

import java.util.Scanner;

public class _04_Javaif {
    public static void main(String[] args) {
        // girilen bir sayinin tek mi cift mi oldugunu bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi1= scan.nextInt();
        if (sayi1%2==0){
            System.out.println("cift");

        }
        if (sayi1%2==1){
            System.out.println("tek");

        }
    }
}
