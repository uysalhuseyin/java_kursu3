package Alistirma;

import java.util.Scanner;

public class GirilenIkiSayiyiKarsilatirma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Enter number");
        int number1= scan.nextInt();
        System.out.println("2. Enter number");
        int number2=scan.nextInt();
        if (number1> number2) {
            System.out.println("1st number is greater than 2nd number" );

        } else if (number1<number2) {
            System.out.println("1st number is less than 2nd number");
        }
        else {
            System.out.println("1st number equals 2nd number");
    }
}
}
