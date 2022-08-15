package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // Girilen bir cumledeki ilk kelimeyi yazdiriniz/
        // index of ile birinci boslugu bulduk
        // birinci bosluktan sonrasi +1 yaptik 2 kelimeyi bulduk.
        //substring ile de aldik.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String text= scan.nextLine();
        int Indexof=text.indexOf(" ");
        int Indexof2=text.indexOf(" ",Indexof+1);
        String text2=text.substring(0,Indexof2);
        System.out.println("ilk 2 kelime="+text2);
    }
}
