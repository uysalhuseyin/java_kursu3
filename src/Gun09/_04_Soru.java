package Gun09;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen 3 basamakli bir sayinin tersi olan sayiyi bulunuz.
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();
        int yuzler=sayi/100;
        int onlar=(sayi/10)%10;
        int birler=sayi%10;
        int tersi=birler*100+onlar*10+yuzler;
        System.out.println("tersi = " + tersi);
    }
}
