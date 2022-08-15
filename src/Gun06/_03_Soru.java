package Gun06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // girilen bir sitringin sadece son harfini yazdiriniz.
        //charArt dedigi zaman bir lenfth bir eksigini alacagiz
        Scanner scan=new Scanner(System.in);
        System.out.println("Kelime girin");
        String kelime=scan.nextLine();
         int uzunluk=kelime.length();
         char sonharf=kelime.charAt(uzunluk-1);
        System.out.println("sonharf = " + sonharf);
    }
}
