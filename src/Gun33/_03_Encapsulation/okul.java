package Gun33._03_Encapsulation;

import java.util.ArrayList;

public class okul {
    private String okuladi;
    private int kontenjan;
    ArrayList<ogrenci> ogrenciler=new ArrayList<>();

    public String getOkuladi() {
        return okuladi;
    }

    public void setOkuladi(String okuladi) {
        this.okuladi = okuladi;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public okul (String okuladi, int kontenjan){

    }
}
