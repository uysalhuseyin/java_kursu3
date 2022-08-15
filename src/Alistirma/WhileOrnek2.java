package Alistirma;

import java.util.Scanner;

public class WhileOrnek2 {
    public static void main(String[] args) {
        //ornek=1 den 100 e kadar olan cift sayilari ekrana yazdiran program
        // ornek= negatif bir defer girilene kadar kullanicidan girisleri kabul eden
        // ve girilen degerlerden tek sayilari toplayan program
        // ornek= girilen sayiya olan 2 nin kuvvetleri.
       /* ornek1
        int i=1;
        while(i<=100 ){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }
        */

        Scanner scan=new Scanner(System.in);
       int toplam=0;
       int i;
       while (true){
           System.out.println("Lutfen bir say giriniz");
           i=scan.nextInt();
           if (i<0){
               System.out.println("Program bitti cunku negatif sayi girdin");
               System.out.println("girilen sayilarin toplami = " + toplam);
                break;
           }
           if(i%2==1){
               toplam+=i;
           }
       }

    }
}
