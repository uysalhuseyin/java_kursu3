package Gun29._02_Constructor;

public class kitapci {
    public static void main(String[] args) {
        //book class yaziniz. fields:name, publishyear, autor.
        // 3 adet Consructor ekleyiniz.
        // kitaplarin ozelliklerini tek bir satirda yazdiran bir metod ekleyiniz.
        // 3 adet kitabi farkli Consructor la olusturup , mainde yazdiriniz.

        book kitap=new book();
        kitap.name="Ince mehmet";
        kitap.publishyear=2022;
        kitap.author="Yasar kemal";

        //1.Constructor
        book kitap2=new book("nutuk", 1927, "Ataturk");
        book kitap3=new book("Nutuk", 1927);
        kitap.yazdir();
        kitap2.yazdir();
        kitap3.yazdir();
        System.out.println("kitap="+kitap);


    }
}
