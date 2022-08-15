package Alistirma;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int quiz,vize,ffinal;
        double ortalama;
        Scanner scan=new Scanner(System.in);
        System.out.println("Quiz notu giriniz");
        quiz= scan.nextInt();
        System.out.println("Vize notu giriniz");
        vize= scan.nextInt();
        System.out.println("Final notunu giriniz");
        ffinal= scan.nextInt();
        ortalama=(quiz*0.2)+(vize*0.35) +(ffinal*0.45);
        System.out.println("Ortalama = " + ortalama);
        if (ortalama>50) {
            System.out.println("Gecti");

        }
        else
            System.out.println("kaldi");
    }
}
