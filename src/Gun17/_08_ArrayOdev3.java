package Gun17;

public class _08_ArrayOdev3 {
    public static void main(String[] args) {
        ////int Array oluşturun ve elemanları : 12,2,5,15,8
        //    //En kucuk değeri yazdırınız.
      int [] dizi={14,19,5,21};
      int enk=dizi[0];
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]<enk)
                enk=dizi[i];
        }
        System.out.println("Dizide ki en kucuk sayi="+enk);
    }
}
