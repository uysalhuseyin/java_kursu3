package Gun15;

import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {
        // girilen bir sayiya kadar olan sayilarin carpimimi bulunuz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        int carpim=0;
        for (int i=1; i<sayi; i++){
            carpim=sayi*i;

        }
        System.out.println("Carpımı="+carpim);
    }
}
