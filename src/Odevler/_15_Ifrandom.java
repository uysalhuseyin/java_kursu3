package Odevler;

import java.util.Scanner;

public class _15_Ifrandom {
    public static void main(String[] args) {
        //Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
        //Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%9==0 && sayi%5==0){
            System.out.println("Able to divide by 9 and 5");
        }
        if (sayi%4==0 && sayi%11.5==0) {

            System.out.println("Able to divide by 4 and 15");

        }else {
            System.out.println("kosullari saglamiyor");
        }
    }
}
