package Gun31.StaticModifier.Finalmodifler;

public class NufusMudurlugu {
    // Vatandas isimli bir Class tanımlayınız (fields: isim, tcNo)
    // tcNo değerini int olarak alınız ve nesne oluşturulurken
    // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
    // kontrol için mainde 2 kişi tanımlayınız.
    public static void main(String[] args) {
        vatandas v1=new vatandas("ismet");
        vatandas v2=new vatandas("ali");
        vatandas v3=new vatandas("ahmet");

        System.out.println("v1="+v1);
        System.out.println("v2="+v2);
        System.out.println("v3="+v3);

        //v1.tcno+6;
        // final degiskenlerine sadece 1 kez veri atanabilir.
        // o da tanimlanirken , ya da Constructor da

        final  double pi=3.14; // tanimlanirken

    }
}
