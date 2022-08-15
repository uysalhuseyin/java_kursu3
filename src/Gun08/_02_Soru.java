package Gun08;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        //Girilen bir kelimenin bos olup olmadigini yazdiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir deger giriniz");
        String text= scan.nextLine();
        System.out.println("bosluk mu = " + text.isEmpty());
    }
}
