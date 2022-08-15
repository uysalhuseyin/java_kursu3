package Gun38._01_Ornek;

public class Bus extends  Vehicle implements IGas{

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeOil() {
        return "Bir depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "Sehir icine girme";
    }
}
