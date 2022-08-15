package Gun39._01_Ornek;

public abstract class BinekOto {
    private String marka;

    private int uretimyili;
    private  int vitesadedi;

    public abstract String getMarka(); // govdesiz hali

    public void setMarka(String marka) { // govdeli hali
        this.marka = marka;
    }

    public int getUretimyili() {
        return uretimyili;
    }

    public void setUretimyili(int uretimyili) {
        this.uretimyili = uretimyili;
    }

    public int getVitesadedi() {
        return vitesadedi;
    }

    public void setVitesadedi(int vitesadedi) {
        this.vitesadedi = vitesadedi;
    }


}
