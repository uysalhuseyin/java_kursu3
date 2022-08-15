package Gun12;

public class _07_JavaRandom {
    public static void main(String[] args) {
        //soru:0 ile 6 arasinda random bir sayi ureten program.
        // math.random
        double Randomsayi=Math.random();
        int tamSayi=(int)(Randomsayi*6); // carpi 6 dedigi icin 6 kadar olan sayilari verdi.
        // double olani da int degerine cevirdik.
        System.out.println("tamSayi = " + tamSayi);
    }
}
