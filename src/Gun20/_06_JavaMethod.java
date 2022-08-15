package Gun20;

import java.util.Scanner;

public class _06_JavaMethod {
    // Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
// her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int secim=0;
      do {

          menuyaz();
          secim= scan.nextInt();
          if (secim<6 && secim>0)
              Islemyap(secim);


      } while(secim<6 && secim>0);
    }
    public static void menuyaz(){

        System.out.println("1-Toplama\n"+
                "2. cikarma\n"+
                "3.Carpma\n"+
                "4.Bolme\n"+
                "5.Faktoriyel\n"+
                "6.Cikis\n"+
                "secim yapin lutfen="
                );
    }

    public static void Islemyap(int secim){
        Scanner scan2=new Scanner(System.in);
        int sayi1=0;  int sayi2=0;
        if (secim<5){
            System.out.println("1. sayi giriniz");
            sayi1=scan2.nextInt();
            System.out.println("2. sayi giriniz");
            sayi2=scan2.nextInt();
        }
        else {
            System.out.println("Sayi=");
            sayi1=scan2.nextInt();
        }
        switch (secim){
            case 1: toplama(sayi1,sayi2);break;
            case 2: carpma(sayi1,sayi2);break;
            case 3: cikarma(sayi1,sayi2);break;
            case 4: bolme(sayi1,sayi2);break;
            case 5: faktoriyel(sayi1,sayi2);break;

        }

    }
    public static void toplama (int sayi1 , int sayi2){
        System.out.println(sayi1+sayi2);
    }
    public static void carpma (int sayi1 , int sayi2){
        System.out.println(sayi1*sayi2);
    }

    public static void cikarma (int sayi1 , int sayi2){
        System.out.println(sayi1-sayi2);
    }
    public static void bolme (int sayi1 , int sayi2){
        System.out.println(sayi1/sayi2);
    }
    public static void faktoriyel (int sayi1 , int sayi2){
        int carpim=1;
        for (int i = 0; i <sayi1 ; i++) {
            carpim=carpim*i;
            System.out.println("faktoriyeli="+carpim);

        }
    }
}
