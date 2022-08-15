package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split:bir Stringi parcalara ayirmak demek
        // kullanicidan alacaginiz cumleyi kelimelere gore alt alta yazdiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle= scan.nextLine();
        String[] kelimeler=cumle.split(" ");
        System.out.println("kelimler="+ Arrays.toString(kelimeler));
        System.out.println("kelimeler sayisi="+kelimeler.length);
    }
}
