package Tekrar.javametod;

public class ornek {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 5- Adım : getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi
    // şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

    public static void main(String[] args) {


  person person1=new person();
    person1.name="Ali";
    person1.surname="uysal";
    person1.age=35;

    person person2=new person();
    person2.name="Huseyin";
    person2.surname="uysal";
    person2.age=27;

    person1.infoprint();
    person2.infoprint();
    person1.getInitials();
    person2.getInitials();




    }

    }



