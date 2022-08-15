package Gun40._01_Ornek;

public abstract class Hayvan {
    private int id;
     private String isim;
    private boolean vahsi;
    private String dogumtarihi;

    abstract void yiyecegi ();
    abstract void yemekMiktari ();
    abstract void gunlukUykuSuresi ();
    abstract void sesi ();

    private static int sayac=0;

    public Hayvan(String isim, boolean vahsi, String dogumtarihi) {

        setIsim(isim);
        setVahsi(vahsi);
        setDogumtarihi(dogumtarihi);
    }

    @Override
    public String toString() {
        yiyecegi();
        yemekMiktari();
        gunlukUykuSuresi();
        sesi();
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumtarihi='" + dogumtarihi + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ++sayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }
}
