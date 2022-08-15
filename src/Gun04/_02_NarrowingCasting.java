package Gun04;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;
        
        sayi=(int)oran; // double tipindeki 3.2 degeri int tipine atildi.
        // bu tip donusume daraltma yonunda oldugunda narrowing casting denir.
        // diger adiyla extra islem yapildigindan manuel donusum de denir.
        System.out.println("sayi = " + sayi);

    }
}
