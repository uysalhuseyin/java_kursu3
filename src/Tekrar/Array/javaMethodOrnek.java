package Tekrar.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class javaMethodOrnek {
    public static void main(String[] args) {
        int [] array=new int[5];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Bir sayi giriniz");
            array[i]= scan.nextInt();

        }
        enkYaz(array);
        enbyaz(array);
    }


        public static void enkYaz(int []array){
            Arrays.sort(array);// diziyi kucukten buyuge siraladik.
            System.out.println("en kucuk="+array[0]); // en kucuk
    }

    public  static  void enbyaz(int[] array){
        Arrays.sort(array);
        System.out.println("En buyuk="+array[array.length-1]);
    }


}
