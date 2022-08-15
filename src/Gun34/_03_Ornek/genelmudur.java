package Gun34._03_Ornek;

public class genelmudur extends calisan{
    double tazminat;
    public genelmudur(String isim, int maas, int maasKatsayisi, double tazminat) {
        super(isim, maas, maasKatsayisi);
        this.tazminat=tazminat;

    }

    @Override
    public double maasHesaplama() {
        return super.maasHesaplama()+tazminat;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
