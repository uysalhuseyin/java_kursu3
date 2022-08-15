package Odevler;

import java.util.Scanner;

public class _03_odev {
    public static void main(String[] args) {

        /*Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle= scan.nextLine();
        char ilkharf=cumle.charAt(0);
        char sonharf=cumle.charAt(cumle.length()-1);
        System.out.println("ilk ve son harfler="+ilkharf+"-"+sonharf);

        System.out.println("cumle giriniz");
        String kelime= scan.nextLine();
        int bosluk=kelime.indexOf(" ");
        int kelime2=kelime.indexOf(" ",bosluk+1);
        String text2=kelime.substring(0,kelime2);
        System.out.println("ayri ayri="+text2);


        System.out.println("3 kelime giriniz");
        String x= scan.nextLine();
        char ilk=x.charAt(0);
        char ikinci=x.charAt(x.indexOf(" ")+1);
        char son=x.charAt(x.lastIndexOf(" ")+1);
        System.out.println("Girilen 3 kelimen bas harftleri="+ilk+"*"+ikinci+"*"+son);

        System.out.println("Kelime girin");
        String text= scan.nextLine();
        System.out.println("B harfi var mi yok mu="+text.contains("B"));

        Scanner scan2=new Scanner(System.in);
        System.out.print("Kredi karti numaranizi giriniz =");
        String kredikart= scan2.nextLine();

        int kartuzunluk=kredikart.length()-4;
        String son4hane=kredikart.substring(kartuzunluk);
        System.out.println("Kredi karti no:" +son4hane);*/

        //Girilen bir cümledeki son kelimeyi bulunuz java

        Scanner scan3=new Scanner(System.in);
        System.out.println("Cumle giriniz");
        String cumle5= scan3.nextLine();
        String sonkelime=cumle5.substring(cumle5.lastIndexOf(" ")+1);
        System.out.println("son kelime="+sonkelime);





    }
}
