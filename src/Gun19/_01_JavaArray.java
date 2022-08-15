package Gun19;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100) doldurduktan sonra,
        // sadece tek elemanlarınız bir başka diziye atayınız.
        int []dizi=new int [10];
        int []tekler=new int[10];

        for (int i = 0; i < dizi.length; i++)
            dizi[i]=(int)(Math.random()*100);

        int tekindex=0;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]%2==1){
                tekler[tekindex]=dizi[i];
                tekindex++;
            }

        }
        System.out.println("dizi  ="+ Arrays.toString(dizi));
        System.out.println("tekler="+Arrays.toString(tekler));

    }
}
