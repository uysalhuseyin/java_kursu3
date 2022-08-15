package Tekrar.Constructor3;

public class Banks {
    // bir banka class tanimlayiniz
    // 3 adet field ekleyiniz adi, subesayisi, kurusyili
    // 3 adet constructor ekleyiniz.
    // to string metodu olusturunuz.
    // 3 tane nesne olusturup mainde yazdiriniz

    public static void main(String[] args) {
        Bank bank1=new Bank("Yapikredi",45, 1965);
        Bank bank2=new Bank("Garanti", 67, 1987);
        Bank bank3=new Bank("FinansBank",34, 1999);

        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(bank3);
    }
}
