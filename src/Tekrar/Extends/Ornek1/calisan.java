package Tekrar.Extends.Ornek1;

public class calisan {
    String isim;
    int maas;
    int maasKatsayisi;

    public calisan(String isim, int maas, int maasKatsayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }

    public double maasHesapla (){
     return maas*maasKatsayisi;
    }

    @Override
    public String toString() {
        return "calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }
}
