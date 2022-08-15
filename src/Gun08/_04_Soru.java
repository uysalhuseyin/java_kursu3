package Gun08;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //Girilen bir password sizin bildiginiz bir kelimeyle es olup olmadigini bulunuz.
        String kod="bayrak";
        System.out.println("Sifre giriniz");
        Scanner scan=new Scanner(System.in);
        String sifre= scan.nextLine();
        System.out.println("Sifre gecerlimi="+sifre.equalsIgnoreCase(kod));
    }
}
