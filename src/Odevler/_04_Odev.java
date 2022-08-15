package Odevler;

import java.util.Scanner;

public class _04_Odev {
    public static void main(String[] args) {
        int num1=8;
        int num2=4;
        int bolme=num1/num2;
        System.out.println("Sonuc="+bolme);
        
        int num3=10;
        int num4=2;
        int bolme2=num3/num4;
        int sonuc=bolme2;
        System.out.println("sonuc = " + sonuc);
        
        double num5=4;
        double num6=7;
        double num7=8;
        double carpma=num5*num6*num7;
        double sonuc2=carpma;
        System.out.println("sonuc2 = " + sonuc2);
        
        int num8=8;
        int num9=10;
        int num10=11;
        int num11=34;
        int carpma2=num8*num9*num10*num11;
        int sonuc3=carpma2;
        System.out.println("sonuc3 = " + sonuc3);

        int num12=20;
        int num13=7;
        int kalan=num12%num13;
        System.out.println("kalan = " + kalan);

        int num14=100;
        int num15=50;
        int num16=30;
        int num17=20;
        int cikartma=num14-num15-num16-num17;
        int sonuc4=cikartma;
        System.out.println("sonuc4 = " + sonuc4);

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi7= scan.nextInt();
        int birler=sayi7%10;
        int onlar=(sayi7/10)%10;
        int yuzler=(sayi7/100)%10;
        System.out.println("birler-onlar-yuzler = " + birler+"-"+onlar+"-"+yuzler);


    }
}
