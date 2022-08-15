package Gun29._03_Constructor;

public class bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
    public static void main(String[] args) {

        bank bnk1=new bank("garanti", 455, 1955);
        bank bnk2=new bank("YKB", 345);
        System.out.println(bnk1);
        System.out.println(bnk2);
    }
}
