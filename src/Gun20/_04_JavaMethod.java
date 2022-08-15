package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        tekmiCift(4);
        tekmiCift(5);
        tekmiCift(9);

    }

    public static void tekmiCift(int sayi){
        if (sayi%2==0)
            System.out.println("Cift");
        else
            System.out.println("tek");

    }

    public static void tekmiCiftOku(){
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi= oku.nextInt();
        if (sayi%2==0)
            System.out.println("Cift");
        else
            System.out.println("tek");

    }


}
