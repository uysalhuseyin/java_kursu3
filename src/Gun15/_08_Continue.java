package Gun15;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yaziniz.
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir cumle giriniz");
        String cumle= scan.nextLine();
        for (int i=0; i<cumle.length(); i++){

            if (cumle.charAt(i)==' ')continue;
            System.out.print(cumle.charAt(i));
        }

    }
}
