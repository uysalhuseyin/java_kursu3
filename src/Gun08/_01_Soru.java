package Gun08;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        String text1,text2;
        //Ayri ayri girilen ad ve soyadi aralarinda bir bosluk koyarak birlestiriiniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Ad giriniz");
        text1= scan.nextLine();
        System.out.println("Soyad giriniz");
        text2= scan.nextLine();
        System.out.println("ad soyad = " + text1.concat(" ").concat(text2));

    }
}
