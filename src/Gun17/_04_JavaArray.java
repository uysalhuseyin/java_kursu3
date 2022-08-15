package Gun17;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 5 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

        Scanner scan=new Scanner(System.in);
        int[] a=new int [5];
        int toplam=0;
        for (int i = 0; i<a.length; i++) {
            System.out.print((i+1)+".Sayi giriniz=");
            a[i]=scan.nextInt();
            toplam+=a[i]; // toplam + girilen sayi
            // buraya kadar topluyor program
        }
        //bundan sonra ortalamayi alacagiz.
        double ortalama=toplam/a.length;
        System.out.println("ortalama="+ortalama);
        int adet=0; // ekstra olarak burda adet atayacagiz ortalamayi gecen sayi sayisini bulmak icin
        for (int i = 0; i <a.length; i++) {
            if (a[i]>ortalama) // toplam olarak atadigimiz sayi ort buyuk ise
                adet++;

        }
        System.out.println("ortalamadan buyuk sayi miktari="+adet);


    }
}
