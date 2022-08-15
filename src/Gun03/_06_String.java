package Gun03;

public class _06_String {
    public static void main(String[] args) {
        int sayi=5;
        String ad="osman";
        // String ifadelerin sayi gibi bir siniri olmadigi icin "" tirnak ile belli edilir.
        String soyad="yildiz";
        System.out.print("ad");
        System.out.println(ad);
        System.out.println("ad"+"soyad");
        System.out.println(ad+soyad);
        
        int yas=45;
        int kilo=72;
        String bilgi=ad+soyad+yas+kilo;
        System.out.println("bilgi = " + bilgi);
    }
}
