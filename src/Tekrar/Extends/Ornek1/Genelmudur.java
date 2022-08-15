package Tekrar.Extends.Ornek1;

public class Genelmudur extends calisan {

    double tazminat;
    public Genelmudur(String isim, int maas, int maasKatsayisi,double tazminat) {
        super(isim, maas, maasKatsayisi);
        this.tazminat=tazminat;

    }

    @Override
    public double maasHesapla() {
        return  super.maasHesapla()+tazminat;
    }

    @Override
    public String toString() {
        return "Genelmudur{" +
                "tazminat=" + tazminat +
                '}';
    }
}
