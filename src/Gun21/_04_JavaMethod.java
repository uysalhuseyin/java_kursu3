package Gun21;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Ogrenci adi");
            String isim=scan.nextLine();
            System.out.println("Ogrenci Notu");
            String notlar=scan.nextLine();

            int ort=ortalamabul(notlar);
            System.out.println("isim ve ort="+isim+" "+ort);


        }
    }

    public static int ortalamabul(String notlar){

     String[] notDizisi=notlar.split( " ");
     int toplam=0;
        for (int i = 0; i <notDizisi.length ; i++)
            toplam=toplam+Integer.parseInt(notDizisi[i]);

            return toplam/ notDizisi.length;



    }


}
