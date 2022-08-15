package Gun17;

import java.util.Scanner;

public class _01_JavaDizisiNedir {
    public static void main(String[] args) {
        int [] notlar=new int[250];
        Scanner scan=new Scanner(System.in);
        for (int i=0; i<250; i++){
            System.out.println("lutfen notu giriniz");
            notlar[i]=scan.nextInt();
        }
    }
}
