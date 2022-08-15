package Gun26._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class okul {
    public static void main(String[] args) {
        //ogretmen icin not defteri programi yapilma isteniyor.
        //her ogrencinin okulno(int) , tamAdi (String) ve notu (int) vardir.
        // Butun sinifi bir metodda yazdiriniz.
        // sinifin not ortalamasini yine bir metodda yazdiriniz.
        // gerekli class lar icin ayri ayri yazdiriniz.

        ArrayList<ogrenci> snf=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            ogrenci ogr=new ogrenci();
            System.out.print("Okul no=");
            ogr.okulNo= scan.nextInt();
            System.out.print("Tam ad=");
            ogr.tamAd= scan.nextLine();
            System.out.print("Notu=");
            ogr.not= scan.nextInt();

            snf.add(ogr);



        }
        bilgiYazdir(snf);
        ortalamaYaz(snf);
    }

    public  static void bilgiYazdir (ArrayList<ogrenci> snf){

        for (ogrenci ogr:snf)
            System.out.println(ogr.okulNo+" "+ogr.tamAd+" "+ogr.not);
    }

    public  static void  ortalamaYaz(ArrayList<ogrenci> snf){
        int toplam=0;
        for (ogrenci ogr:snf
             ) {
            toplam=toplam+ogr.not;

            System.out.println("ortalama="+(toplam/snf.size()));


        }
    }



}
