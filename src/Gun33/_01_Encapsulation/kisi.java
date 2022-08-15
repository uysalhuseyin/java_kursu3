package Gun33._01_Encapsulation;

public class kisi {
    String ad;
    String soyad;
    private int yas;

    public kisi(){

    }


    public kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "kisimain{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }



}
