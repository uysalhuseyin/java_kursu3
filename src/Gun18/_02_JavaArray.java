package Gun18;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.println("Cumle giriniz");
        String cumle=scan.nextLine();

        int bosluk=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==' ')
                bosluk++;
        }
        System.out.println("kelime sayisi="+(bosluk+1));

    }
}
