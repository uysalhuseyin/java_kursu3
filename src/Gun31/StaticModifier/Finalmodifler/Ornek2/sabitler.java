package Gun31.StaticModifier.Finalmodifler.Ornek2;

public class sabitler {
    final static   int Saatsayisi=24;
    final static int dakikasayisi=60;
    final static int saniyesayisi=60;

    public  static  int hesapla(int gun, int saat, int dakika){

        int toplamSaniye=
                gun*Saatsayisi*dakikasayisi*dakikasayisi*sabitler.saniyesayisi+
                saat *dakikasayisi*saniyesayisi+dakikasayisi;
        return  toplamSaniye;
    }

}
