package Gun11;

import java.util.Scanner;

public class _05_Ifelse {
    public static void main(String[] args) {
        //girilen bir stringin uzunlugu 10 dan buyukse ve string icinde
        // study kelimesi geciyorsa ekrana evet yazdirin degilse hayir
        // hayir yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime= scan.nextLine();

        if (kelime.length()>10 && kelime.contains("study")){
            System.out.println("evet");
        }
        else {
            System.out.println("hayir");
        }
    }
}
