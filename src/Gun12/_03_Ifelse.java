package Gun12;

import java.util.Scanner;

public class _03_Ifelse {
    public static void main(String[] args) {
        //3 saate kadar 10 tl 5 saate kadar 15 tl 5 den buyuk ise 20 tl
        // kullanicidan kac saat kaldigini alarak ucreti yazdiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Saati giriniz");
        int saat= scan.nextInt();

        if (saat<=3){
            System.out.println("10 tl");
        } else if (saat<5) {
            System.out.println("15 tl");

        }
        else {
            System.out.println("20 tl");
        }
    }
}
