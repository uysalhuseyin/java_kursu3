package Gun29._01_Constructor;

public class okul {
    // Bir student sinifi olusturunuz (id , name , surname, classroom (int)) ve
    // bundan 7 adet ogrenci olusturunuz.
    public static void main(String[] args) {
        student ogr1=new student();
        ogr1.id=1;
        ogr1.name="Ali kemal";
        ogr1.surname="inal";
        System.out.println("ogr1="+ogr1.name);

        student ogr2=new student();
        ogr2.id=1;
        ogr2.name="Metin";
        ogr2.surname="inal";
        System.out.println("ogr1="+ogr2.name);

        student ogr3=new student(3,"yasin","erkol", 9);
        System.out.println("ogr3="+ogr3.name);

    }
}
