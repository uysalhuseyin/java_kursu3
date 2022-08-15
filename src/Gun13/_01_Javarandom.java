package Gun13;

import java.util.Scanner;

public class _01_Javarandom {
    public static void main(String[] args) {
        // 1- den 10 a kadar urettik , 5-10 arasi desek nasil yapabilirdik.
        //10 ile 20 arasi bir sayi bulmak istersek asagidaki programi kullanmamiz gerekiyor.

        Scanner scan=new Scanner(System.in);
        System.out.println("Min+");
        int min= scan.nextInt();

        System.out.println("Max+");
        int max= scan.nextInt();
        int numberInragnge=(int)(Math.random()*((max-min)+1))+min;
        System.out.println("aradaki aralik="+numberInragnge);
    }
}
