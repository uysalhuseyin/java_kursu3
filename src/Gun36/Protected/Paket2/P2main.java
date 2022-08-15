package Gun36.Protected.Paket2;

import Gun36.Protected.Paket1.P1hayvan;

public class P2main  {
    public static void main(String[] args) {
        P1hayvan h2=new P1hayvan();
        h2.ad="Kedi";
        P2kedi kedi1=new P2kedi("Kopuk","van");
        System.out.println("kedi1 = " + kedi1);
    }


}
