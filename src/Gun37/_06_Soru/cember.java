package Gun37._06_Soru;

public class cember implements Geometri {

    @Override
    public double cevre(double... dizi) {
        double yaricap=dizi[0];
      return Math.PI*yaricap*2;

    }

    @Override
    public double alan(double... dizi) {

        return Math.PI*dizi[0]*dizi[0];
    }
}
