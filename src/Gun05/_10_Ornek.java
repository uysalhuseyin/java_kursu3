package Gun05;

import java.util.Scanner;

public class _10_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Cadde adiniz giriniz");
        String cadde= scan.nextLine();
        System.out.println("Sokak adini giriniz");
        String sokak=scan.nextLine();
        System.out.println("posta kodunuz giriniz");
        int posta= scan.nextInt();
        Scanner scan2=new Scanner(System.in); // Bir satiri okumaz ise tekrar Scanne kullaniyoruz.
        System.out.println("ulke adini giriniz");
        String ulke= scan2.nextLine();
    }
}
