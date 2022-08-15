package Gun26;

import java.util.Scanner;

public class _01_JavaClassAndObject {
    // metodun yazilabildigi yer
    public static void main(String[] args) {
        //ana programin basladigi ve calistgi yer

        int sayi=5;
        Scanner scan=new Scanner(System.in);
        araba benimarabam=new araba();
        benimarabam.renk="Kirmizi";
        benimarabam.yili=2020;
        benimarabam.motorhacmi=1600;

        System.out.println("Benim arabanin rengi="+benimarabam.renk);
        System.out.println("Arabanin motor hacmi="+benimarabam.motorhacmi);
        System.out.println("Arabanin model yili="+benimarabam.yili);
    }

    // metodlarin yazilabildigi yer.
}

class araba { // bu bolume class diyoruz ve bu sekilde tanimlaniyor.
    String renk;
    int yili;
    double motorhacmi;




}
