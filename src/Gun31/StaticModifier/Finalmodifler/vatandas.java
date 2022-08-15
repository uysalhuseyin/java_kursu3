package Gun31.StaticModifier.Finalmodifler;

public class vatandas {
    String isim;
    final int tcNo;

    static int tcNosayac=1001;

    public vatandas(String isim) {
        this.isim = isim;
        this.tcNo=++tcNosayac;
    }

    @Override
    public String toString() {
        return "vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
