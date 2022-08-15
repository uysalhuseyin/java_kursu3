package Tekrar.Constructor;

public class okul {
    public static void main(String[] args) {
        // bir student sinifi olusturunuz (id, name, surname classroom (int) ve
        // bundan 3 adet ogrenci olusturunuz.

        student student1=new student();
        student1.id=235;
        student1.name="Ali";
        student1.surname="Uysal";
        student1.classroom=11;

        student student2=new student();
        student2.id=235;
        student2.name="Ali";
        student2.surname="Uysal";
        student2.classroom=11;


        student student3=new student();
        student3.id=235;
        student3.name="Ali";
        student3.surname="Uysal";
        student3.classroom=11;

        student1.yazdir();
        student2.yazdir();
        student3.yazdir();



    }
}
