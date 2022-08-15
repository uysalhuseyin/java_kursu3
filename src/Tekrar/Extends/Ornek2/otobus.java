package Tekrar.Extends.Ornek2;

public class otobus extends Arac {

    private int yolcusayisi;
    public otobus(String renk, int motor, String marka, int yolcusayisi) {
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
