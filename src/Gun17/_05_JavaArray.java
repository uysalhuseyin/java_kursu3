package Gun17;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.
        Scanner scan=new Scanner(System.in);
        int[]dizi=new int [7];
        int toplam=0;

        for (int i = 0; i <dizi.length ; i++) {
            System.out.println("Sayi giriniz");
            dizi[i]= scan.nextInt();
            toplam+=dizi[i];

        }
        double ortalama=toplam/dizi.length;
        int adet=0;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]>ortalama && dizi[i]%2==1)
                adet++;
        }
        System.out.println("ort buyuk ve tek olan sayilar="+adet);

    }
}
