package Odevler;

import java.util.Scanner;

public class _31_WhileForBreakContinue {
    public static void main(String[] args) {
        //Girilen bir cumledeki a harfi sayısını bulunuz.(Regex kullanmayın)


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle= scan.nextLine();
        int sayisi=0;
        for (int i=0;i<cumle.length(); i++){
            if (cumle.charAt(i)=='a')
                sayisi++;

        }
        System.out.println("a larin sayisi="+sayisi);
    }
}
