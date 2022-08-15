package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {
        String girilenKelime="65";
        System.out.println("girilenKelime = " + girilenKelime);

        // Kelimenin > sayiya cevrilmesi.

        int Sayihali=Integer.parseInt(girilenKelime);
        double doubleHali=Double.parseDouble(girilenKelime);
        System.out.println("Sayihali = " + Sayihali);
        System.out.println("doubleHali = " + doubleHali);

        int sicaklik=12;

        System.out.println("bugun hava "+sicaklik+" derece");


    }
}
