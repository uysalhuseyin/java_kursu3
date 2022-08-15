package Gun31.StaticModifier.Ornek2;

public class student {
    int id;
    String name;
    String surname;
    static int sayac=0;
    public student(String name, String surname){
        this.id=sayac++;
        this.name=name;
        this.surname=surname;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
