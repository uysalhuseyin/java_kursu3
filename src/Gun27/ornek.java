package Gun27;

public class ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 5- Adım : getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi
        // şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        person kisi1=new person();
        kisi1.name="Hatice";
        kisi1.surname="Namli";
        kisi1.age=20;

        person kisi2=new person();
        kisi2.name="Osman";
        kisi2.surname="yildiz";
        kisi2.age=35;
        kisi1.Bilgiyazdir();
        kisi2.Bilgiyazdir();
        System.out.println();
        kisi1.getBirthYear();
        kisi2.getBirthYear();
        System.out.println();
        kisi1.getInitials();
        kisi2.getInitials();



    }
}
