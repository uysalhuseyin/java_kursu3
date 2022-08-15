package Gun27._03_ornek;

public class elektirikhesabi {
    int toplamtuketim=0;
    double birimfiyat=0.7;
    double fatura=0;

    public void tuketimEkle(int tuketim){
        toplamtuketim=tuketim;
    }
    public void toplamtuketimyaz(){
        System.out.println("toplamtuketim = " + toplamtuketim);
    }

    public void odenecektutar(){
        System.out.println("Odenecek tutar="+birimfiyat*toplamtuketim);
    }
}
