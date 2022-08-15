package Tekrar.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraytekrar {
    //100 elemanli bir diziyi random (0-100) doldurduktan sonra
    // sadece tek elemanlarini bir baska diziye atayiniz.


    public static void main(String[] args) {
        int [] dizi=new int[100];
        int [] tekler=new int[100];


        for (int i = 0; i < dizi.length ; i++)
            dizi[i]=(int)(Math.random()*100);

        int tekinde=0;

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]%2==1){
                tekler[tekinde]=dizi[i];
                tekler[i]=dizi[i];
                System.out.println("dizi="+ Arrays.toString(dizi));
                System.out.println("tekler="+ Arrays.toString(tekler));
            }

        }


    }




}
