package Gun36.Soru;

public class main {
    public static void main(String[] args) {
        ogrenci ogr1=new ogrenci("Ali", "uysal", "QA", "Adana subesi");
        calisan cs1=new calisan("Huseyin","uysal","DEV","Antalya subesi" );
        kimlikbelgesi(ogr1);
        kimlikbelgesi(cs1);


    }
    public static  void kimlikbelgesi (kisiler k){
        k.kimlikbelgesi();

    }


}
