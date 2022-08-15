package Gun36.Soru;

public class kisiler {
    private String ad;
    private  String soyad;
    private String gorevi;
    private String  subesi;

    public kisiler(String ad, String soyad, String gorevi, String subesi) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorevi = gorevi;
        this.subesi = subesi;
    }
    public void kimlikbelgesi(){
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("gorevi = " + gorevi);
        System.out.println("subesi = " + subesi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }
}
