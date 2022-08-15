package Gun34._03_Ornek;

public class sirketmain {
    public static void main(String[] args) {
        calisan cls1=new calisan("Ali", 300,3600);
        System.out.println("Calisanin maasi="+cls1.maasHesaplama());
        System.out.println("Calisan="+cls1);

        genelmudur gnl=new genelmudur("Enes",300,3600, 500);
        System.out.println("Genel mudur maasi="+gnl.maasHesaplama());
        System.out.println("Genel mudur="+gnl);
    }

}
