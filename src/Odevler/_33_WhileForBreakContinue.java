package Odevler;

import java.util.Scanner;

public class _33_WhileForBreakContinue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.print(cumle.charAt(0));
        for (int i=0; i<cumle.length(); i++){
            if (cumle.charAt(i)==' ')
                System.out.print(cumle.charAt(i+1));
        }
    }
}
