package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        int [] dizi1=new int[5];
        Scanner scan=new Scanner(System.in);
        for (int i=0; i<dizi1.length;i++){
            System.out.println("Sayi giriniz");
            dizi1[i]= scan.nextInt();
        }
        System.out.println("dizi[4]="+dizi1[4]);
    }
}
