package Gun17;

public class _12_ArrayOdev8 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.

        int []dizi={12,14,21,23,10,4};
        int toplama=0;
        int ortalama=0;
        for (int i = 0; i < dizi.length ; i++) {
            toplama+=dizi[i];
        }
        for (int i = 0; i < dizi.length; i++) {
            ortalama=toplama/ dizi.length-1;
        }
        System.out.println("Sayilarin toplami="+toplama);
        System.out.println("Sayilarin ortalamasi="+ortalama);
    }
}
