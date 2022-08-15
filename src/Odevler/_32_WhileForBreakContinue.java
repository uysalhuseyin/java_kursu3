package Odevler;

import java.util.Scanner;

public class _32_WhileForBreakContinue {
    public static void main(String[] args) {
     //Girilen bir cümledeki kelime sayısını bulunuz.(Regex kullanmayın)
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle= scan.nextLine();
        int kelimeS=0;
        for (int i=0; i<cumle.length(); i ++){
            if (cumle.charAt(i)==' ')
                kelimeS++;
        }
        System.out.println("Cumledeki kelime sayisi="+(kelimeS+1));
    }
}
