package Gun11;

import java.util.Scanner;

public class _03_Ifelse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num= scan.nextInt();
        if (num%2==0){
            System.out.println("Sayi cifttir");
        }
        else {
            System.out.println("Sayi tektir");
        }
    }
}
