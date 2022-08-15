package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // girilen bir ad soyadin Ismet temur I.T. seklinde yaziniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Ad ve Soyad giriniz");
        String ad= scan.nextLine();
        char ilkharf=ad.charAt(0);
        int bosluk=ad.indexOf(" ");
        char soyad=ad.charAt(bosluk+1);
        System.out.println("Sifreli ad = " +ilkharf+""+soyad);
    }
}
