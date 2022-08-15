package Gun11;

import java.util.Scanner;

public class _06_Ifelse {
    public static void main(String[] args) {
        //GIRILEN bir stringin uzunlugu 10 dan buyuk ise ve stringin icinde study kelimesi
        // geciyorsa evet gecmiyorsa hayir ve buyuk kucuk harf onemli degil
        // toLowerCase ile hepsini kucuk haline cevircem


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime= scan.nextLine();

        if (kelime.length()>10 && kelime.toLowerCase().contains("study")){
            System.out.println("evet");
        }
        else {
            System.out.println("hayir");
        }
    }
}
