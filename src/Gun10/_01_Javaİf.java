package Gun10;

import java.util.Scanner;

public class _01_Javaİf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>10){
            System.out.println("10 dan buyuk");
        }else
            System.out.println("10 dan kucuk");
    }
}
