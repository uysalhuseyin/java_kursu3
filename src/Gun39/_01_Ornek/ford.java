package Gun39._01_Ornek;

public class ford extends BinekOto {
    @Override
    public String getMarka() {
        return "Ford";
    }

    @Override
    public int getUretimyili() {
        System.out.println("Uretim yili=");
        return super.getUretimyili();
    }
}
