package Tekrar.Encapsulation.Ornek1;

public class Car {
   private String renk;
   private String model;
   private int motorhacmi;
   private int kapisayisi;

    public Car(String renk, String model, int motorhacmi, int kapisayisi) {
        setRenk(renk);
        setModel(model);
        setMotorhacmi(motorhacmi);
        setKapisayisi(kapisayisi);
    }

    public Car() {
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotorhacmi() {
        return motorhacmi;
    }

    public void setMotorhacmi(int motorhacmi) {
        this.motorhacmi = motorhacmi;
    }

    public int getKapisayisi() {
        return kapisayisi;
    }

    public void setKapisayisi(int kapisayisi) {
        this.kapisayisi = kapisayisi;
    }

    @Override
    public String toString() {
        return "Car{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motorhacmi=" + motorhacmi +
                ", kapisayisi=" + kapisayisi +
                '}';
    }
}
