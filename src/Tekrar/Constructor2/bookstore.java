package Tekrar.Constructor2;

public class bookstore {
    //book class field: name, publishyear, author.
    // 3 adet constructor ekleyiniz.
    // 3 adet kitabi farkli constructor olusturma ve mainde yazdirma.

    public static void main(String[] args) {
        book book1=new book("Akitabi", 1966, "Ali osman");
        book book2=new book("Bitabi", 1987, "Ali fuat");
        book book3=new book("Ckitabi", 1947,"Ahmet hasim");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }

    }

