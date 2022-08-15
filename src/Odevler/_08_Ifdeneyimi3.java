package Odevler;

import java.util.Scanner;

public class _08_Ifdeneyimi3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime= scan.nextLine();
        if (kelime.contains("A")){
            System.out.println("var");
        }
        else {
            System.out.println("yok");
        }
    }
}
