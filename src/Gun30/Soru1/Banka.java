package Gun30.Soru1;

public class Banka {
    // Hesap (yatan, cekilen, bakiye(direk erişim olmamalı))
    // Musteri (hesapID, ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,
    // sonra 50 TL çekiniz. Müşteirini kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadıgını kontrol ediniz.
    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.hesapID=1;
        mus1.ad="Ali";
        mus1.soyad="Azim";
        mus1.musteriHesap=new Hesap();
        mus1.musteriHesap.moneydep(100);
        mus1.musteriHesap.moneydep(200);
        mus1.musteriHesap.wd(50);
        System.out.println("Extre="+mus1.musteriHesap);
    }
}
