package Tekrar.Encapsulation.Ornek2;

public class Student {
    private String name;
    private  String surname;
    private  int age;

    private static int IDcnt=0;

    public Student() {
    }

    public Student(String name, String surname, int age) {
        setAge(age);
        setName(name);
        setSurname(surname);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
