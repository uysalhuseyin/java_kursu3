package Gun27._03_ornek;

public class ornek3 {
    //1.Adım  :ayrı dosyada olmak üzere Musteri isimli (fields: name) isimli bir class tanımlayınız.
    //2.Adım  :ayrı bir dosyada ElektrikHesabi isimli (fields : toplamTuketim, oran(double), OdenecekTutar)
    //3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
    //4.Adım  :1 tane müşteri oluşturunuz, Hesabı u dahil;
    //5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
    //         tuketimEkle olasun her verilen aylık rakamı toplayarak biriktirsin.
    //6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız yazdırınız.

    //ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
    //        ondan sonra toplam alarak çıkartınız

    public static void main(String[] args) {
        musteri mus1=new musteri();
         mus1.name="Ali";

         //1 .yontem
        //elektirikhesabi eh=new elektirikhesabi();
        //mus1.elektrikhesabi=eh;

        // 2.yontem
        mus1.elektrikhesabi=new elektirikhesabi();
        mus1.elektrikhesabi.tuketimEkle(100);
        mus1.elektrikhesabi.tuketimEkle(200);
        mus1.elektrikhesabi.tuketimEkle(300);
        mus1.elektrikhesabi.toplamtuketimyaz();
        mus1.elektrikhesabi.odenecektutar();

    }
}
