package Gun04;

public class _07_Ornek4 {
    public static void main(String[] args) {
        //short olarak atadiginiz bir degeri stringe cevirerek ekrana yazdiriniz
        
        short sayi=345;
        String strSayi=Short.toString(sayi); // herhangi bir islemde sayi olarak kullanilamaz.Sadece ekranda sayi olarak
        // gorunuz . Ekran sayi olarak gorunse bile assinda o bir sayi.
        System.out.println("strSayi = " + strSayi);
        
    }
}
