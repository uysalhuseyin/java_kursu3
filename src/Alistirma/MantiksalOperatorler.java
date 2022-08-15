package Alistirma;

public class MantiksalOperatorler {
    public static void main(String[] args) {
        // ve: kosu1 && kosul2 > Her iki kosulda dogru olmasi gerekiyor.
        // veya: kosul1 || kosul2 > Bir tanesi dogru olmasi yetiyor.
        // degil: !(kosul1 && kosul2)
        // Mantiksal operatorler TRUE ve FALSE  degerlerini dondurur.

        int a=10;
        int b=20;
        int c=5;
        int d=50;

        boolean kosul1=a<b;
        boolean kosul2=d>c;
        boolean sonuc=kosul1 && kosul2;
        boolean sonuc2=(a<b) && (d>c);
        System.out.println("sonuc = " + sonuc);
        System.out.println("sonuc2 = " + sonuc2);
        boolean sonuc3= kosul1 || kosul2;
        // her iki kosuldan biri saglaniyor ise True yazdir.
        System.out.println("sonuc3 = " + sonuc3);
        
    }
}
