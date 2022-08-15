package Odevler;

import java.util.Scanner;

public class _13_Ifdeyimi {
    public static void main(String[] args) {
        //3- Girilen bir keliede bosluk veya A harfinin olup olmadığını kontrol ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime= scan.nextLine();
        if (kelime.contains("A") || kelime.contains(" ")){
            System.out.println("A harfi veya bosluk var");
        }
        else {
            System.out.println("A harfi veya bosluk yok");
        }


    }
}
