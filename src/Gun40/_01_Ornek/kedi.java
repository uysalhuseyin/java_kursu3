package Gun40._01_Ornek;

public class kedi extends Hayvan {
    public kedi(String isim, boolean vahsi, String dogumtarihi) {
        super(isim, vahsi, dogumtarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("et");

    }

    @Override
    void yemekMiktari() {
        System.out.println("gunde 1 kg");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8 saat");

    }

    @Override
    void sesi() {
        System.out.println("cik cik");

    }
}
