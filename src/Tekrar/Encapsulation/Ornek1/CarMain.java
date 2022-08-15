package Tekrar.Encapsulation.Ornek1;

public class CarMain {

    public static void main(String[] args) {
        Car car1=new Car();
        car1.setRenk("kirmizi");
        car1.setModel("Sedan");
        car1.setMotorhacmi(2000);
        car1.setKapisayisi(5);

        System.out.println("car1 = " + car1);
    }

}
