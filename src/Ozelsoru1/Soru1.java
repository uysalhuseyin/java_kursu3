package Ozelsoru1;


import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("x degerini giriniz");
        int x= scan.nextInt();
        System.out.println("y degerini giriniz");
        int y= scan.nextInt();
        if ((x>-2 && x<8) && (y>1 && y<4)) {
            System.out.println("icinde");
        }
        else  if (x==-2 || x==8 || y==1 || y==4) {
            System.out.println("ustunde");
        }
        else
        System.out.println("disinda");
    }


        }





        


