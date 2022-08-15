package Gun31.StaticModifier.Ornek1;

public class ogrenci {

    String ad;
    String soyad;

    static String Okulad="Yildirim orta okulu";
    // hepsi icin gecerli tek bir tane eleman

    public  ogrenci(String ad, String soyad){
        this.ad=ad;
        soyad=soyad;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
