package Gun08;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //Girilen bir cumledeki ilk kelimeyi yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String text= scan.nextLine();
       String firstText= text.substring(0,text.indexOf(" "));
        System.out.println("birinci kelime="+firstText);
    }
}
