package Odevler;

import java.util.Scanner;

public class _07_Ifdeniyimi2 {
    public static void main(String[] args) {
        //Girilen bir kelimenin ilk ve son harfinin aynı olup olmadığını yazdırınız.
        //char ilkharf=kelime.charAt(0);
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime= scan.nextLine();
        char ilkharf=kelime.charAt(0);
        char sonharf=(kelime.charAt(kelime.length()-1));
        if (ilkharf == sonharf){
            System.out.println("ilk ve son esit");
        }
        else {
            System.out.println("esit degil");
        }


    }
}
