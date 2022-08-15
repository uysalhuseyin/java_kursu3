package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kac tane bilet istiyorsunuz");
        byte biletsayisi= scan.nextByte();
        System.out.println("Sigorta istiyormusunuz");
        boolean sigorta= scan.nextBoolean();
        System.out.println("Bilet sayisi = "+biletsayisi+ ",sigorta =" + sigorta);
    }
}
