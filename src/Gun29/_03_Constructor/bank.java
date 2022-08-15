package Gun29._03_Constructor;

public class bank {
    String adi;
    int subesayisi;
    int kurulusyili;

    public bank() {
    }

    public bank(String adi, int subesayisi, int kurulusyili) {
        this.adi = adi;
        this.subesayisi = subesayisi;
        this.kurulusyili = kurulusyili;
    }

    public bank(String adi, int subesayisi) {
        this.adi = adi;
        this.subesayisi = subesayisi;
    }

    @Override
    public String toString() {
        return "bank{" +
                "adi='" + adi + '\'' +
                ", subesayisi=" + subesayisi +
                ", kurulusyili=" + kurulusyili +
                '}';
    }
}
