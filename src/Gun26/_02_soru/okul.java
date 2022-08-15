package Gun26._02_soru;

import java.util.ArrayList;
import java.util.Scanner;

public class okul {
    public static void main(String[] args) {
        // bir okul kayit programi icin ogrenci bigileri alan modul
        // yazilacaktir. Ogrenci ye ait bigiler (adi , soyadi, sinifi ve adres) vardir.
        // Kullanicidan 3 adet ogrenci bilgileri alarak doldurunuz.
        // daha sonra bunlarin bilgilerini yazdiriniz.

        ArrayList<ogrenci> snf=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        for (int i=1; i<=3; i++){
            ogrenci ogr=new ogrenci();
            System.out.print("Ogrenci adi=");
            ogr.ad=scan.nextLine();
            System.out.print("Soy adi=");
            ogr.soyad=scan.nextLine();

            snf.add(ogr);

        }

        for (ogrenci ogr:snf
             ) {
            System.out.println("Ogrenci adi="+ogr.ad);
            System.out.println("Ogrenci soyadi="+ogr.soyad);

        }


    }
}

class ogrenci {

    String ad;
    String soyad;
    int sinif;
    String adres;

}

