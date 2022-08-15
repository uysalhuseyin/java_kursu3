package Gun17;

public class _09_ArrayOdev4 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int [] dizi={15,25,22,18,30};
        int enb=dizi[0];
        int enb2=dizi[0];
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]>enb)
                enb=dizi[i];
        }
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]<enb && dizi[i]>enb2)
                enb2=dizi[i];
        }
        System.out.println("en büyük 2. sayi="+enb2);
    }
}
