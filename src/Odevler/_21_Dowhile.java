package Odevler;

import java.util.Scanner;

public class _21_Dowhile {
    public static void main(String[] args) {
        //Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuzç
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Number");
        int degree= scan.nextInt();
        int counter=1;
        int multiplication=0;
        while (counter<degree){
            multiplication=multiplication+counter;
            counter++;
        }
        System.out.println("multiplication="+multiplication);





    }
}
