package Gun17;

public class _15_ArrayOdev11 {
    public static void main(String[] args) {
        int [] dizi={25,30,30,35,100};
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
        }
        System.out.println("Sayilarin toplami="+toplam);
    }
}
