package Gun39._02_Ornek;

public  abstract class sekil {
    private String name;
    abstract double alan();
    abstract  double cevre();

    public  void ciz (){
        System.out.println(this.name+"isimli cizildi.");
    }

    @Override
    public String toString() {
        return "sekil{" +
                "name='" + name + '\'' +
                "alan='" + alan() + '\'' +
                "cevre='" + cevre() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
