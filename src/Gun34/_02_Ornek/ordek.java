package Gun34._02_Ornek;

public class ordek extends hayvan{
    public ordek(String renk, int kilo) {
        super(renk, kilo);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vak vak dedi");
    }
}
