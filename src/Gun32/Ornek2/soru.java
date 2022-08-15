package Gun32.Ornek2;

import java.util.ArrayList;

public class soru {
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
        //kullanicilari yazdirmak icin arraylist
        ArrayList<user> userlar=new ArrayList<>();
        user user1=new user("ali",statu.AKTIF,rol.ADMIN);
        user user2=new user("kayisi",statu.AKTIF,rol.MUDUR);

        userlar.add(user1);
        userlar.add(user2);

        System.out.println("kullanicilar="+userlar);


    }

    public static void usersil(user user){
        //admin silinemez.
        if (user.rol == rol.ADMIN) {
            System.out.println("Admin silinemez");

        }
    }

}
