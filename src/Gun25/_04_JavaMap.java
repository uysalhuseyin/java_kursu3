package Gun25;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_JavaMap {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Çıkış

        Map<String,String> sozluk=new TreeMap<>();
        Scanner scan=new Scanner(System.in);
        int secim=0;
        do {
            System.out.println("********Menu*******");
            System.out.println("1- Ekleme");
            System.out.println("2- Duzeltme");
            System.out.println("3- Listeleme");
            System.out.println("4- Arama");
            System.out.println("5- Silme");
            System.out.println("6- Cikis");
            secim=scan.nextInt();

            switch (secim){
                case 1:
                    System.out.println("Kelimeyi giriniz");
                    String kelime=scan.nextLine();
                    System.out.println("Anlamini giriniz");
                    String anlami=scan.nextLine();
                    sozluk.put(kelime,anlami);

                    // ekleme
                    break;
                case 2: // duzeltme
                    break;
                case 3:
                    System.out.println("sozluk="+sozluk);
                    // listeleme
                    break;
                case 4: // Arama
                    break;
                case 5: // Silme
                    break;
            }


        }while(secim<6);
    }
}
