package Tekrar.Enum.Ornek2;

public class Main {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
    // SILME işlemi kontrolü yapınız bir metod için.
    // rakam sayi kelime atamayacagim bir seyde enuem kullanacagiz rol
    // verecegimiz durumlarda.

    public static void main(String[] args) {
        USER  user1=new USER("ismet", statu.AKTIF, rol.ADMIN);
        USER user2=new USER("Ali",statu.PASIF,rol.MUDUR);



    }
}
