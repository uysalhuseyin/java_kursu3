package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class  _05_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve ortalamasını bulduktan sonra
        // bu dizinin bütün elemanlarının karelerini yeni bir diziye atınız
        // bu dizininde en küçük, en büyük elemanını ve ortalamasını bulunuz.

        int []dizi=new int[5];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("Sayi=");
            dizi[i]=scan.nextInt();


        }
        enkYaz(dizi);
        enkYaz(dizi);
        ortYaz(dizi);

        int [] dizi2=new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi2[i]=dizi[i]*dizi[i];
        }
        enkYaz(dizi2);
        enkYaz(dizi2);
        ortYaz(dizi2);

    }
    public static void enkYaz(int []dizi){
        Arrays.sort(dizi);// diziyi kucukten buyuge siraladik.
        System.out.println("en kucuk="+dizi[0]); // en kucuk
    }
    public static void enbYaz(int []dizi){
        Arrays.sort(dizi);
        System.out.println("en buyuk="+dizi[dizi.length-1]); // en buyuk olani bulduk
    }

    public static void ortYaz(int []dizi){
        int toplam=0;
        for (int i = 0; i < dizi.length ; i++) {
            toplam+=dizi[i];
        }
        int ort=toplam/ dizi.length;
        System.out.println("ortalama="+ort);
    }
}
