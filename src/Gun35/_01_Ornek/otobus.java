package Gun35._01_Ornek;

public class otobus extends arac {

    private int yolcusayisi; // atadigimiz veriler belli bir kontrolden gecsin diye private yapiyoruz.
    public otobus(String renk, double motor, String marka, int yolcusayisi, int yolcusayisi1) {
        super(renk, motor, marka);
        setYolcusayisi(yolcusayisi);
    }

    public int getYolcusayisi() {
        return yolcusayisi;
    }

    public void setYolcusayisi(int yolcusayisi) {
        this.yolcusayisi = yolcusayisi;
    }

    @Override
    public String toString() {
        return "otobus{" +
                "yolcusayisi=" + yolcusayisi +
                '}';
    }
}
