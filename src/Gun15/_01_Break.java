package Gun15;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //girelen bir sayinin iki ayni sayinin carpima esit olup olmadigini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number");
        int number= scan.nextInt();
        int counter=1;
        int aranasayi=0;
        while(counter<number){
            if (counter*counter==number){
                aranasayi=counter;
                break;
            }
            counter++;
        }
        if (aranasayi>0){
            System.out.println("Tam karedir, sayi="+aranasayi);
        }else {
            System.out.println("Bu sayi tam kare degildir");
        }

    }
}
