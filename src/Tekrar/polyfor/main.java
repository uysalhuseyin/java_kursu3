package Tekrar.polyfor;

public class main {
    public static void main(String[] args) {

        student student1=new student("Halil","findik","homework","11A");
        employee employee1=new employee("Ismet","Temur","java","Devops");
        System.out.println(student1);
        System.out.println(employee1);

        person.identification(student1);
        person.identification(employee1);

    }
}
