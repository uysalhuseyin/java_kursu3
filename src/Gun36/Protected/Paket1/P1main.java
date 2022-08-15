package Gun36.Protected.Paket1;

import Gun36.Protected.Paket2.P2main;

// ayni paketin icerisinde erisim duzeyleri.
public class P1main extends P2main {
    public static void main(String[] args) {
        P1hayvan h=new P1hayvan();
        h.ad="kedi"; // public erilsildi.
        h.yas=2; // defauld erisildi.
        h.cinsi="van"; // protected erisildi.
        //h.renk private; sadece kendi classinin icerisinden ulasilabilir.

    }
}
