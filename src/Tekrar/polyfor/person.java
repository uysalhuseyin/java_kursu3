package Tekrar.polyfor;

public class person {

    private String name;
    private  String surname;
    private  String task;

    public person(String name, String surname, String task) {
        setName(name);
        setSurname(surname);
        setTask(task);
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

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", task='" + task + '\'' +
                '}';
    }
    public static void identification(person comeperson){
        System.out.println("name = " + comeperson.name);
        System.out.println("surname = " + comeperson.surname);
        System.out.println("task = " + comeperson.task);

        if (comeperson instanceof student) {
            System.out.println(" Subesi= " +((student) comeperson).getSube());
        }
        if (comeperson instanceof employee)
            System.out.println("Departman = " + ((employee) comeperson).getDepartment());


    }

}
