package Gun34._03_Ornek;

public class calisan {
   private String isim;
    private double maas;
    private int maasKatsayisi;

    public calisan(String isim, double maas, int maasKatsayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }
    public  double maasHesaplama(){
        return  maas*maasKatsayisi;
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
