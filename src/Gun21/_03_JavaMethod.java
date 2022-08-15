package Gun21;

public class _03_JavaMethod {
    public static void main(String[] args) {
        String ad="ismet";
        String soyad="temur";
        String tamAd=topla(ad,soyad);
        System.out.println("tamAd = " + tamAd);
    }

    public static  String topla(String ad, String soyad){
        return ad+" "+soyad;
    }
}
