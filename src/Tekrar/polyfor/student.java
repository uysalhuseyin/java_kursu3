package Tekrar.polyfor;

public class student extends person{

    private String sube;
    public student(String name, String surname, String task,String sube) {
        super(name, surname, task);
        this.sube=sube;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }


}
