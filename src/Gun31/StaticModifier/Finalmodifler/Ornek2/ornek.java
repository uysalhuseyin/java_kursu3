package Gun31.StaticModifier.Finalmodifler.Ornek2;

import java.util.Scanner;

public class ornek {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika ve saniyeyi alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {
        int gun=0;
        int saat=0;
        int dak=0;
        Scanner oku=new Scanner(System.in);
        System.out.println("Gun=");
        gun= oku.nextInt();
        System.out.println("saat=");
        saat= oku.nextInt();
        System.out.println("dakika=");
        dak= oku.nextInt();

        System.out.println("sabitler.hesapla(gun,saat,dak) = " + sabitler.hesapla(gun,saat,dak));
        
    }
    
            

}
