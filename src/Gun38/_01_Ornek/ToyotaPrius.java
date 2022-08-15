package Gun38._01_Ornek;

public class ToyotaPrius extends Vehicle implements IElectric ,IGas {

    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "10 yil bataryasi gider";
    }

    @Override
    public String changeOil() {
        return "Cok az benzin yakar";
    }

    @Override
    public String drive() {
        return "Taxi icin cok guzel bir araba";
    }
}
