package Odevler;

import java.util.Scanner;

public class _21_Switchcase {
    public static void main(String[] args) {
        //3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.

        int randomNumber= (int)(Math.random() * (80-20)+1)+20;

        int ones= randomNumber %10;
        switch (ones){
            case 0:System.out.println(""); break;
            case 1:System.out.println("one"); break;
            case 2:System.out.println("two"); break;
            case 3:System.out.println("three"); break;
            case 4:System.out.println("four"); break;
            case 5:System.out.println("five"); break;
            case 6:System.out.println("six"); break;
            case 7:System.out.println("seven"); break;
            case 8:System.out.println("eight"); break;
            case 9:System.out.println("nine"); break;


        }
        System.out.println("Random number="+randomNumber);
    }
}
