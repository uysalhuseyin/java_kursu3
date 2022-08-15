package Gun17;

import java.util.Arrays;

public class _11_ArrayOdev6 {
    public static void main(String[] args) {
     int [] dizi={1,2,3,4};
     int [] dizi2=new int[2];
     dizi2[0]=dizi[0];
     dizi2[1]=dizi[dizi.length-1];
        System.out.println(Arrays.toString(dizi2));

    }
}
