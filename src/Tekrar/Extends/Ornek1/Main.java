package Tekrar.Extends.Ornek1;

public class Main {
    public static void main(String[] args) {
        calisan calisan1=new calisan("Ismet",5500,2);
        System.out.println("Calisanin maasi="+calisan1.maasHesapla());
        Genelmudur genelmudur1=new Genelmudur("Faruk",1000,3,10);
        System.out.println("Genel mudur maas="+genelmudur1.maasHesapla());

    }

}
