package Gun06;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {
        // girilen bir string de bosluk olup olmadigini bulunuz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz=");
        String girilen=scan.nextLine();
        System.out.println("bosluk varmi = " + girilen.contains(" "));
    }
}
