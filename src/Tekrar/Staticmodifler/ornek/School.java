package Tekrar.Staticmodifler.ornek;

public class School {
    // Student (id,name. surname)
    // yukaridaki gibi 5 ogrenci tanimlayiniz.
    // her ogrenci tekip eden bir numarasi olmali.
    // ve en son kac ogrenci oldugunu bulamilmeyelim.
    public static void main(String[] args) {

     student student1=new student("ali", "uysal");
     student student2=new student("osman", "yildiz");
     student student3=new student("mehmet","temur");
     student student4=new student("zeynep","temur");
     student student5=new student("asli","temur");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

    }
}
