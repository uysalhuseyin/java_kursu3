package Gun31.StaticModifier.Ornek2;

public class school {
    // Student (id, name, surName)
    // Yukarıdaki gibi 5 öğrenci tanımlayınız.
    // Her öğrencinin takip eden bir id si olmalı.
    // Ve en son kaç öğrenci olduğunu bulabilmeliyim.

    public static void main(String[] args) {
        student ogr1=new student("ismet", "temur");
        student ogr2=new student("mehmet", "temur");
        student ogr3=new student("ali", "temur");

        System.out.println("ogr1="+ogr1);
        System.out.println("ogr2="+ogr2);
        System.out.println("ogr3="+ogr3);

        System.out.println("Ogrenci sayisi="+student.sayac);
        // TODO: Kullanıcıya bir menu ile öğrenci ekleme, silme , arama
        // TODO: duzeltme imkanı veriniz. Öğrenci silinse bile en son
        // TODO: öğrenci sayısı doğru gözükmeli.
    }
}
