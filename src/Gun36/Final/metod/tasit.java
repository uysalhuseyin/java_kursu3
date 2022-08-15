package Gun36.Final.metod;

public class tasit {
    private String model;

    public tasit(String mode) {
        this.model = model;
    }

    public String getMode() {
        return model;
    }

    public void setMode(String mode) {
        this.model = model;
    }

    @Override
    public final String toString() {
        return "tasit{" +
                "model='" + model + '\'' +
                '}';
    }
}
