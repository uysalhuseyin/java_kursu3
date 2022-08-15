package Tekrar.Ornek56;

public class soru {
    // Bir universite  ogrencilerin ders kaydi yapilacak.
    //1-lesson fields: name , credit (1 ile 10 arasinda deger aliyor)
    //3- adet ders olusturuyoruz.
    //3- 3 adet ders olusturunuz.
    //4- 1 adet ogrenci tanimlayiniz alabilecegi maxcredit 10 olsun
    //5- bu ogrencinin ders listesine acilmis dersleri gecmemeli gecerse uyari versin
    // alabilecegi max credi doldu seklinde.
    public static void main(String[] args) {
        lesson lesson1=new lesson();
        lesson1.name="Mat101";
        lesson1.credit=4;

        lesson lesson2=new lesson();
        lesson2.name="Java";
        lesson2.credit=3;

        lesson lesson3=new lesson();
        lesson3.name="Softskills";
        lesson3.credit=1;

        student student1=new student();
        student1.name="Ali";
        student1.maxcredit=10;


        student1.addlesson(lesson1);
        student1.addlesson(lesson2);
        student1.addlesson(lesson3);



    }
}
