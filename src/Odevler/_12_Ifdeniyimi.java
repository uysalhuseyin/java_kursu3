package Odevler;

import java.util.Scanner;

public class _12_Ifdeniyimi {
    public static void main(String[] args) {
        //2- Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup oladığını kontrol ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        if (birler%2==1 && onlar%2==1){
            System.out.println("birler ve onlar basamagi tek");
        }
        if (birler==onlar){
            System.out.println("birler ve onlar basamagi birbine esit");
        }
        else {
            System.out.println("kosullari saglamiyor");
        }
    }
}
