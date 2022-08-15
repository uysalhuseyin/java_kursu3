package Odevler;

import java.util.Scanner;

public class _18_Ifelse {
    public static void main(String[] args) {
        //Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        /*Eğer ortalama not >=90 =>not=A

        Eğer ortalama not >= 70 ve<90 => not=B

        Eğer ortalama not >=50 ve <70 =>not=C

        Eğer ortalama not <50 =>note=F*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your quiz score");
        int quiz= scan.nextInt();
        System.out.println("Enter your intermediate  score");
        int interscore= scan.nextInt();
        System.out.println("Enter your final score");
        int finalscore= scan.nextInt();
        int average=(quiz+interscore+finalscore)/3;
        if (average>=90){
            System.out.println("Your score A");
        } else if (average>=70 && average<90) {
            System.out.println("Your score  B");
        } else if (average>=50 && average<70) {
            System.out.println("Your score C");
        } else if (average<50) {
            System.out.println("Yor score F Not successful");
        }


    }
}
