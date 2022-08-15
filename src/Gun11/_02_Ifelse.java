package Gun11;

import java.util.Scanner;

public class _02_Ifelse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Vize notunu giriniz");
        int vize= scan.nextInt();
        System.out.println("final notunu giriniz");
        int ffinal= scan.nextInt();
        double ortalama=(vize*0.4)+(ffinal*0.6);
        if (ortalama>=60){
            System.out.println("gectiniz");
        }
        else {
            System.out.println("kaldiniz");
        }
    }
}
