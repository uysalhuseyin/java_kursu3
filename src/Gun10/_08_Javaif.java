package Gun10;

import java.util.Scanner;

public class _08_Javaif {
    public static void main(String[] args) {
        // girilen bir sayinin birler ve onlar
        // basamagina esit olup olmadigini bulunuz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        int birler=sayi%10;
        int yuzler=(sayi/10)%10;
        if (birler==yuzler){
            System.out.println("birler ve onlar basamagi esit");
        }
    }
}
