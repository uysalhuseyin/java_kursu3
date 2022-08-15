package Gun32.Ornek3;

import java.util.ArrayList;
import java.util.Scanner;

public class pizzasiparisi {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<pizza> siparis=new ArrayList<>();

        int secim=0;
        do {

          secim=scan.nextInt();
          switch (secim){






          }

        }while(secim<=4);
    }

}
