package Gun11;

import java.util.Scanner;

public class _07_Ifelse {
    public static void main(String[] args) {
        //Girilen sifre min 8 karakter
        // icinde pass gecmeyecek
        // en fazla 12 karakter olacak
        //Eger basinda ! var ise o gecmiyor ise olmuyor ise
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sifre giriniz");
        String sifre= scan.nextLine();
        if (sifre.length()>=8 && sifre.length()<=12 && sifre.contains("pass")==false){
            System.out.println("uygun");
        }
        else {
            System.out.println("degil");
        }
    }
}
