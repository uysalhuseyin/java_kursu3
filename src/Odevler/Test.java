package Odevler;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        System.out.println("bir deger giriniz");
        String text= scan.nextLine();
        int uzunluk=text.length();
        String bosluk=text.replace(" ","");
        int uzunluk2=bosluk.length();
        int kelimeS=uzunluk-uzunluk2+1;
        System.out.println("Cumeldeki kelime sayisi="+kelimeS);*/

        Scanner scan3=new Scanner(System.in);
        System.out.println("Cumle giriniz");
        String cumle5= scan3.nextLine();
        String sonkelime=cumle5.substring(cumle5.lastIndexOf(" ")+1);
        System.out.println("son kelime="+sonkelime);



    }
}
