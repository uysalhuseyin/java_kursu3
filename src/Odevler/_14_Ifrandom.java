package Odevler;

import java.util.Scanner;

public class _14_Ifrandom {
    public static void main(String[] args) {
        //kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
        //bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Tam olan kismi=");
        String tam= scan.next();
        System.out.println("Ondalik kismi=");
        String onda= scan.next();
        String strSAyi=tam.concat(".").concat(onda);
        double sayi=Double.parseDouble(strSAyi);
        System.out.println("sayi="+sayi);
    }
}
