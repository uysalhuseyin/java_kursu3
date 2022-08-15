package Gun08;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //Girilen bir kelimenin ilk ve son harfini bulunuz.
        //Char ile ilk harfi aldik
        //length kelimenin uzunlugundan 1 cikarttik mi son harfi buluyoruz. length 1 den basliyor
        //CharAt 0 dan basliyor.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime girin");
        String text= scan.nextLine();
        Character first=text.charAt(0);
        Character last=text.charAt(text.length()-1);
        System.out.println("Ilk ve son harf="+first+" "+last);
    }
}
