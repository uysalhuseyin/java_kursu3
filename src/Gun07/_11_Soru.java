package Gun07;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        // girilen bir string de ki nokta sayisini bulunuz.
        Scanner scan=new Scanner(System.in);
        System.out.println("bir deger giriniz");
        String text= scan.nextLine();
        int uzunluk1=text.length();
        String noktasiz=text.replace(".","");
        int uzunluk2=noktasiz.length();
        System.out.println("Nokta sayisi="+(uzunluk1-uzunluk2));
        
    }
}
