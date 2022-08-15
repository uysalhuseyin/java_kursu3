package Gun35._01_Ornek;

public class arac {
    private String renk;
    private double motor;
    private String marka;

    public arac(String renk, double motor, String marka) {
        setRenk(renk); //kontrol koymak ve sinirlandirmak icin
        setMotor(motor);
        setMarka(marka);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", marka='" + marka + '\'' +
                '}';
    }
}
