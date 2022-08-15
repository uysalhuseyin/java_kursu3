package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int kenar1;
        System.out.println("kenari yaziniz");
        kenar1= scan.nextInt();
        System.out.println("karenin alani = " + (kenar1*kenar1));
        System.out.println("karenin cevresi = " +(4*kenar1) );
    }
}
