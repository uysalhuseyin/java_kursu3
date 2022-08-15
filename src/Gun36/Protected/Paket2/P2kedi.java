package Gun36.Protected.Paket2;

import Gun36.Protected.Paket1.P1hayvan;

public class P2kedi extends P1hayvan {
    public P2kedi(String ad,String cinsi) {
        super.ad=ad;
        super.cinsi=cinsi;
    }

    @Override
    public String toString() {
        return "P2kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
