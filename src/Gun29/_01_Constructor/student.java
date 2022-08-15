package Gun29._01_Constructor;

public class student {
    int id;
    String name;
    String surname;
    int classrom;

    // yapici metod: constructor

    public student (){

        System.out.println("nesne olusturma");
    }
    public student (int id, String name, String surname, int classrom){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.classrom=classrom;
    }

    public student (int id1, String name1, String surname1){
        this(id1,name1,surname1, 0);
        // this: Class in icindeyken karismamasi icin, buradaki manasindan
        // baslarina ekliyoruz.
    }

}
