package Tekrar.polyfor;

public class employee extends person{

    private String department;
    public employee(String name, String surname, String task, String department) {
        super(name, surname, task);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
