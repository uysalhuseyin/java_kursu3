package Gun33._03_Encapsulation;

import java.util.Scanner;

public class okulmain {
    public static void main(String[] args) {
        okul okul=new okul("borsa lisesi", 3);
        Scanner oku=new Scanner(System.in);
        Scanner okuint=new Scanner(System.in);

        do{
            System.out.println("ogrenci adi=");
            String ad=oku.nextLine();

            System.out.println("ogrenci soyadi=");
            String soyad=oku.nextLine();

            System.out.println("ogrenci yasi=");
            int yas=okuint.nextInt();

            if (yas<15){
                //ogrenci ekle
                ogrenci ogr=new ogrenci(ad,soyad,yas);
                okul.ogrenciler.add(ogr);
            }
            else {
                System.out.println("yas sebebi ile kayit alinamadi");
            }

            System.out.println("ogrenciler="+okul.ogrenciler);


        }while (okul.ogrenciler.size()<=okul.getKontenjan());
    }
}
