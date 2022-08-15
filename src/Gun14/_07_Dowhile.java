package Gun14;

import java.util.Scanner;

public class _07_Dowhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
           String okunan="";
        do {
            System.out.println("bir deger giriniz");
            okunan= scan.nextLine();
            System.out.println("Program calisiyor");
        }while (okunan.equalsIgnoreCase("X")==false);
        System.out.println("Program bitti");
    }
}
