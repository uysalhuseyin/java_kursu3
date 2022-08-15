package Gun17;

import java.util.Arrays;

public class _07_ArrayOdev2 {
    //int Array oluşturun ve elemanları : 12,2,5,15,8
    //En büyük değeri yazdırınız.
    public static void main(String[] args) {
        int[] dizi={12,2,5,15,8};
        int enb=dizi[0];
        for (int i = 0; i < dizi.length ; i++) {
           if (dizi[i]>enb)
           enb=dizi[i];
        }
        System.out.println("en buyuk sayi="+enb);
    }
}
