package Gun37._05_Ornek;

public class test implements Igosterir,Iyazdirir {
    @Override
    public void goster() {
        System.out.println("goster");

    }

    @Override
    public void yaz(String mesaj) {
        System.out.println("mesaj = " + mesaj);

    }

    @Override
    public void yaz() {
        System.out.println("yaz");

    }
}
